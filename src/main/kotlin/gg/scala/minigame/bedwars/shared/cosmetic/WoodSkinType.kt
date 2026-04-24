package gg.scala.minigame.bedwars.shared.cosmetic

import org.bukkit.Material

/**
 * @author Limo
 * @date 2/20/2026
 */
object WoodSkinType
{
    fun entries(): List<CosmeticEntry> = listOf(
        CosmeticEntry(
            id = "none",
            displayName = "Default",
            description = listOf("\u00a77Use the default oak planks."),
            material = Material.BARRIER,
            rarity = CosmeticRarity.NONE
        ),
        CosmeticEntry(
            id = "oak_plank",
            displayName = "Oak Planks",
            description = listOf(
                "\u00a77Wooden blocks you place",
                "\u00a77become Oak Planks!"
            ),
            material = Material.WOOD,
            materialData = 0,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "birch_plank",
            displayName = "Birch Planks",
            description = listOf(
                "\u00a77Wooden blocks you place",
                "\u00a77become Birch Planks!"
            ),
            material = Material.WOOD,
            materialData = 2,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "spruce_plank",
            displayName = "Spruce Planks",
            description = listOf(
                "\u00a77Wooden blocks you place",
                "\u00a77become Spruce Planks!"
            ),
            material = Material.WOOD,
            materialData = 1,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "jungle_plank",
            displayName = "Jungle Planks",
            description = listOf(
                "\u00a77Wooden blocks you place",
                "\u00a77become Jungle Planks!"
            ),
            material = Material.WOOD,
            materialData = 3,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "acacia_plank",
            displayName = "Acacia Planks",
            description = listOf(
                "\u00a77Wooden blocks you place",
                "\u00a77become Acacia Planks!"
            ),
            material = Material.WOOD,
            materialData = 4,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "dark_oak_plank",
            displayName = "Dark Oak Planks",
            description = listOf(
                "\u00a77Wooden blocks you place",
                "\u00a77become Dark Oak Planks!"
            ),
            material = Material.WOOD,
            materialData = 5,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "oak_log",
            displayName = "Oak Log",
            description = listOf(
                "\u00a77Wooden blocks you place",
                "\u00a77become Oak Logs!"
            ),
            material = Material.LOG,
            materialData = 0,
            rarity = CosmeticRarity.EPIC
        ),
        CosmeticEntry(
            id = "birch_log",
            displayName = "Birch Log",
            description = listOf(
                "\u00a77Wooden blocks you place",
                "\u00a77become Birch Logs!"
            ),
            material = Material.LOG,
            materialData = 2,
            rarity = CosmeticRarity.EPIC
        ),
        CosmeticEntry(
            id = "spruce_log",
            displayName = "Spruce Log",
            description = listOf(
                "\u00a77Wooden blocks you place",
                "\u00a77become Spruce Logs!"
            ),
            material = Material.LOG,
            materialData = 1,
            rarity = CosmeticRarity.EPIC
        ),
        CosmeticEntry(
            id = "jungle_log",
            displayName = "Jungle Log",
            description = listOf(
                "\u00a77Wooden blocks you place",
                "\u00a77become Jungle Logs!"
            ),
            material = Material.LOG,
            materialData = 3,
            rarity = CosmeticRarity.LEGENDARY
        ),
        CosmeticEntry(
            id = "acacia_log",
            displayName = "Acacia Log",
            description = listOf(
                "\u00a77Wooden blocks you place",
                "\u00a77become Acacia Logs!"
            ),
            material = Material.LOG_2,
            materialData = 0,
            rarity = CosmeticRarity.LEGENDARY
        )
    )

    fun find(id: String) = entries().firstOrNull { it.id == id }

    fun getBlockData(skinId: String): Pair<Material, Byte>?
    {
        return when (skinId)
        {
            "oak_plank" -> Material.WOOD to 0.toByte()
            "birch_plank" -> Material.WOOD to 2.toByte()
            "spruce_plank" -> Material.WOOD to 1.toByte()
            "jungle_plank" -> Material.WOOD to 3.toByte()
            "acacia_plank" -> Material.WOOD to 4.toByte()
            "dark_oak_plank" -> Material.WOOD to 5.toByte()
            "oak_log" -> Material.LOG to 0.toByte()
            "birch_log" -> Material.LOG to 2.toByte()
            "spruce_log" -> Material.LOG to 1.toByte()
            "jungle_log" -> Material.LOG to 3.toByte()
            "acacia_log" -> Material.LOG_2 to 0.toByte()
            else -> null
        }
    }
}
