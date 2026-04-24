package gg.scala.minigame.bedwars.shared.hotbar

import gg.scala.minigame.bedwars.shared.shop.BedWarsShopCategory
import org.bukkit.Material

/**
 * @author Limo
 * @date 2/16/2026
 */
enum class BedWarsHotbarCategory(
    val id: String,
    val displayName: String,
    val icon: Material,
    val defaultSlot: Int
)
{
    Blocks("blocks", "Blocks", Material.STAINED_CLAY, 1),
    Melee("melee", "Melee", Material.GOLD_SWORD, 0),
    Pickaxe("pickaxe", "Pickaxe", Material.IRON_PICKAXE, 2),
    Axe("axe", "Axe", Material.IRON_AXE, 6),
    Shears("shears", "Shears", Material.SHEARS, 3),
    Ranged("ranged", "Ranged", Material.BOW, 4),
    Potions("potions", "Potions", Material.BREWING_STAND_ITEM, 5),
    Utility("utility", "Utility", Material.TNT, 7),
    Compass("compass", "Compass", Material.COMPASS, 8);

    companion object
    {
        val byId = entries.associateBy(BedWarsHotbarCategory::id)
        val configurable = entries.filterNot { it == Compass }
    }
}

/**
 * @author Limo
 * @date 2/16/2026
 */
object BedWarsHotbarLayout
{
    const val HOTBAR_SLOT_COUNT = 9

    val defaultLayout = linkedMapOf(
        BedWarsHotbarCategory.Melee.id to BedWarsHotbarCategory.Melee.defaultSlot,
        BedWarsHotbarCategory.Compass.id to BedWarsHotbarCategory.Compass.defaultSlot
    )

    private val legacyFullDefault = mapOf(
        BedWarsHotbarCategory.Blocks.id to 1,
        BedWarsHotbarCategory.Melee.id to 0,
        BedWarsHotbarCategory.Pickaxe.id to 2,
        BedWarsHotbarCategory.Axe.id to 6,
        BedWarsHotbarCategory.Shears.id to 3,
        BedWarsHotbarCategory.Ranged.id to 4,
        BedWarsHotbarCategory.Potions.id to 5,
        BedWarsHotbarCategory.Utility.id to 7,
        BedWarsHotbarCategory.Compass.id to 8
    )

    private val legacyConfigurableDefault = mapOf(
        BedWarsHotbarCategory.Blocks.id to 1,
        BedWarsHotbarCategory.Melee.id to 0,
        BedWarsHotbarCategory.Pickaxe.id to 2,
        BedWarsHotbarCategory.Axe.id to 6,
        BedWarsHotbarCategory.Shears.id to 3,
        BedWarsHotbarCategory.Ranged.id to 4,
        BedWarsHotbarCategory.Potions.id to 5,
        BedWarsHotbarCategory.Utility.id to 7
    )

    fun normalizeLayout(stored: Map<String, Int>?): MutableMap<String, Int>
    {
        if (stored == null)
        {
            return defaultLayout.toMutableMap()
        }

        if (stored == legacyFullDefault || stored == legacyConfigurableDefault)
        {
            return defaultLayout.toMutableMap()
        }

        val normalized = linkedMapOf<String, Int>()
        val usedSlots = mutableSetOf<Int>()

        stored.forEach { (id, slot) ->
            val category = BedWarsHotbarCategory.byId[id]
                ?: return@forEach

            if (slot !in 0 until HOTBAR_SLOT_COUNT)
            {
                return@forEach
            }

            if (!usedSlots.add(slot))
            {
                return@forEach
            }

            normalized[category.id] = slot
        }

        return normalized.toMutableMap()
    }

    fun assignCategoryToSlot(
        layout: MutableMap<String, Int>,
        category: BedWarsHotbarCategory,
        slot: Int
    ): MutableMap<String, Int>
    {
        if (slot !in 0 until HOTBAR_SLOT_COUNT)
        {
            return normalizeLayout(layout)
        }

        val normalized = normalizeLayout(layout)

        normalized.entries.removeIf { (id, assignedSlot) ->
            id == category.id || assignedSlot == slot
        }

        normalized[category.id] = slot
        return normalized
    }

    fun removeCategory(
        layout: MutableMap<String, Int>,
        category: BedWarsHotbarCategory
    ): MutableMap<String, Int>
    {
        val normalized = normalizeLayout(layout)
        normalized.remove(category.id)
        return normalized
    }

    fun categoryAtSlot(layout: Map<String, Int>, slot: Int): BedWarsHotbarCategory?
    {
        val categoryId = layout.entries
            .firstOrNull { (_, assignedSlot) -> assignedSlot == slot }
            ?.key
            ?: return null

        return BedWarsHotbarCategory.byId[categoryId]
    }

    fun forShopCategory(category: BedWarsShopCategory): BedWarsHotbarCategory? = when (category)
    {
        BedWarsShopCategory.Blocks -> BedWarsHotbarCategory.Blocks
        BedWarsShopCategory.Weapons -> BedWarsHotbarCategory.Melee
        BedWarsShopCategory.Ranged -> BedWarsHotbarCategory.Ranged
        BedWarsShopCategory.Potions -> BedWarsHotbarCategory.Potions
        BedWarsShopCategory.Utility -> BedWarsHotbarCategory.Utility
        BedWarsShopCategory.QuickBuy,
        BedWarsShopCategory.Armor,
        BedWarsShopCategory.Tools,
        BedWarsShopCategory.Rotational -> null
    }
}
