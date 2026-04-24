package gg.scala.minigame.bedwars.shared.rotation

import net.evilblock.cubed.menu.Button
import net.evilblock.cubed.menu.Menu
import net.evilblock.cubed.util.CC
import net.evilblock.cubed.util.bukkit.ItemBuilder
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType
import org.bukkit.inventory.InventoryView
import org.bukkit.inventory.ItemStack
import java.util.concurrent.TimeUnit

/**
 * @author Limo
 * @date 2/18/2026
 */
class RotationalAdminMenu : Menu("Rotational Items Admin")
{
    init
    {
        placeholder = true
        updateAfterClick = true
    }

    override fun size(buttons: Map<Int, Button>) = 54

    override fun getButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = mutableMapOf<Int, Button>()
        val activeIds = RotationalScheduleService.activeItems().map { it.id }.toSet()

        val remaining = RotationalScheduleService.timeUntilNextRotation()
        val hours = TimeUnit.MILLISECONDS.toHours(remaining)
        val minutes = TimeUnit.MILLISECONDS.toMinutes(remaining) % 60

        buttons[4] = object : Button()
        {
            override fun getButtonItem(p0: Player): ItemStack
            {
                return ItemBuilder
                    .of(Material.WATCH)
                    .name("${CC.AQUA}Rotation Info")
                    .addToLore(
                        "${CC.GRAY}Active items: ${CC.GREEN}${activeIds.size}",
                        "${CC.GRAY}Next rotation: ${CC.YELLOW}${hours}h ${minutes}m",
                        "",
                        "${CC.GRAY}Left-click items below to",
                        "${CC.GRAY}toggle them active/inactive.",
                        "${CC.GRAY}Max 2 active at a time."
                    )
                    .build()
            }
        }

        buttons[49] = ItemBuilder
            .of(Material.REDSTONE)
            .name("${CC.RED}Force Rotation")
            .addToLore(
                "${CC.GRAY}Randomly selects 2 new items",
                "${CC.GRAY}and resets the rotation timer.",
                "",
                "${CC.YELLOW}Click to force rotate"
            )
            .toButton { _, _ ->
                Button.playNeutral(player)
                RotationalScheduleService.rotate()
                player.sendMessage("${CC.GREEN}Rotational items have been forcefully rotated!")

                val newActive = RotationalScheduleService.activeItems()
                newActive.forEach { def ->
                    player.sendMessage("${CC.GRAY} - ${CC.WHITE}${def.displayName}")
                }
                RotationalAdminMenu().openMenu(player)
            }

        buttons[50] = ItemBuilder
            .of(Material.TNT)
            .name("${CC.RED}Clear All Active")
            .addToLore(
                "${CC.GRAY}Removes all active items.",
                "",
                "${CC.YELLOW}Click to clear"
            )
            .toButton { _, _ ->
                Button.playNeutral(player)
                RotationalScheduleService.setActiveItems(emptyList())
                player.sendMessage("${CC.RED}All rotational items have been deactivated.")
                RotationalAdminMenu().openMenu(player)
            }

        val allItems = RotationalItemDefinition.entries
        val gridSlots = intArrayOf(
            10, 11, 12, 13, 14, 15, 16,
            19, 20, 21, 22, 23, 24, 25,
            28, 29, 30, 31, 32, 33, 34,
            37, 38, 39, 40, 41, 42, 43
        )

        allItems.forEachIndexed { index, def ->
            if (index >= gridSlots.size) return@forEachIndexed
            val slot = gridSlots[index]

            buttons[slot] = object : Button()
            {
                override fun getButtonItem(p0: Player): ItemStack
                {
                    val currentActiveIds = RotationalScheduleService.activeItems().map { it.id }.toSet()
                    val currentlyActive = def.id in currentActiveIds

                    val builder = ItemBuilder
                        .of(def.icon)
                        .data(def.iconData)
                        .amount(def.amount.coerceAtLeast(1))
                        .name(
                            if (currentlyActive) "${CC.GREEN}${CC.BOLD}${def.displayName} ${CC.D_GRAY}(ACTIVE)"
                            else "${CC.GRAY}${def.displayName}"
                        )

                    def.description.forEach { line ->
                        builder.addToLore("${CC.GRAY}$line")
                    }

                    builder.addToLore("")
                    builder.addToLore("${CC.GRAY}Currency: ${def.currency.color}${def.currency.displayPlural}")
                    builder.addToLore("${CC.GRAY}Cost: ${def.currency.color}${def.cost}")

                    if (currentlyActive)
                    {
                        builder.addToLore("")
                        builder.addToLore("${CC.RED}Click to deactivate")
                        builder.glow()
                    }
                    else
                    {
                        builder.addToLore("")
                        builder.addToLore("${CC.GREEN}Click to activate")
                    }

                    return builder.build()
                }

                override fun clicked(clicker: Player, slot: Int, clickType: ClickType, view: InventoryView)
                {
                    Button.playNeutral(clicker)
                    val currentActive = RotationalScheduleService.activeItems().toMutableList()
                    val currentlyActive = def in currentActive

                    if (currentlyActive)
                    {
                        currentActive.remove(def)
                        RotationalScheduleService.setActiveItems(currentActive)
                        clicker.sendMessage("${CC.RED}Deactivated ${CC.WHITE}${def.displayName}${CC.RED}.")
                    }
                    else
                    {
                        if (currentActive.size >= 2)
                        {
                            clicker.sendMessage("${CC.RED}Already 2 items active! Deactivate one first.")
                            return
                        }

                        currentActive.add(def)
                        RotationalScheduleService.setActiveItems(currentActive)
                        clicker.sendMessage("${CC.GREEN}Activated ${CC.WHITE}${def.displayName}${CC.GREEN}.")
                    }

                    RotationalAdminMenu().openMenu(clicker)
                }
            }
        }

        return buttons
    }
}
