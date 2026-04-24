package gg.scala.minigame.bedwars.shared.rotation

import gg.scala.commons.acf.annotation.CommandAlias
import gg.scala.commons.acf.annotation.CommandPermission
import gg.scala.commons.acf.annotation.Subcommand
import gg.scala.commons.annotations.commands.AutoRegister
import gg.scala.commons.command.ScalaCommand
import net.evilblock.cubed.util.CC
import org.bukkit.entity.Player

/**
 * @author Limo
 * @date 2/18/2026
 */
@AutoRegister
@CommandAlias("bwrotation|bedwarsrotation")
@CommandPermission("bedwars.admin")
object RotationalAdminCommand : ScalaCommand()
{
    @CommandAlias("bwrotation|bedwarsrotation")
    fun onOpen(player: Player)
    {
        RotationalAdminMenu().openMenu(player)
    }

    @Subcommand("force")
    fun onForce(player: Player)
    {
        RotationalScheduleService.rotate()
        player.sendMessage("${CC.GREEN}Rotational items have been forcefully rotated!")

        RotationalScheduleService.activeItems().forEach { def ->
            player.sendMessage("${CC.GRAY} - ${CC.WHITE}${def.displayName}")
        }
    }

    @Subcommand("list")
    fun onList(player: Player)
    {
        val active = RotationalScheduleService.activeItems()

        if (active.isEmpty())
        {
            player.sendMessage("${CC.RED}No rotational items are currently active.")
            return
        }

        player.sendMessage("${CC.GREEN}Active Rotational Items:")
        active.forEach { def ->
            player.sendMessage("${CC.GRAY} - ${CC.WHITE}${def.displayName} ${CC.GRAY}(${def.currency.color}${def.cost} ${def.currency.displayPlural}${CC.GRAY})")
        }
    }
}
