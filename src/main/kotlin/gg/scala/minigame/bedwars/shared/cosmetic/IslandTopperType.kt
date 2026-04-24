package gg.scala.minigame.bedwars.shared.cosmetic

import org.bukkit.Material

/**
 * @author Limo
 * @date 2/20/2026
 */
object IslandTopperType
{
    fun entries(): List<CosmeticEntry> = listOf(
        CosmeticEntry(
            id = "none",
            displayName = "None",
            description = listOf("\u00a77No island topper."),
            material = Material.BARRIER,
            rarity = CosmeticRarity.NONE
        ),
        CosmeticEntry(
            id = "flag",
            displayName = "Flag",
            description = listOf(
                "\u00a77A flag structure appears",
                "\u00a77above your team's island!"
            ),
            material = Material.BANNER,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "pillar",
            displayName = "Pillar",
            description = listOf(
                "\u00a77A quartz pillar rises",
                "\u00a77above your team's island!"
            ),
            material = Material.QUARTZ_BLOCK,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "mushroom",
            displayName = "Mushroom",
            description = listOf(
                "\u00a77A giant mushroom grows",
                "\u00a77above your team's island!"
            ),
            material = Material.RED_MUSHROOM,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "cactus",
            displayName = "Cactus",
            description = listOf(
                "\u00a77A giant cactus grows",
                "\u00a77above your team's island!"
            ),
            material = Material.CACTUS,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "tree",
            displayName = "Tree",
            description = listOf(
                "\u00a77A tree grows above",
                "\u00a77your team's island!"
            ),
            material = Material.SAPLING,
            rarity = CosmeticRarity.EPIC
        ),
        CosmeticEntry(
            id = "lighthouse",
            displayName = "Lighthouse",
            description = listOf(
                "\u00a77A lighthouse stands",
                "\u00a77above your team's island!"
            ),
            material = Material.SEA_LANTERN,
            rarity = CosmeticRarity.EPIC
        ),
        CosmeticEntry(
            id = "castle",
            displayName = "Castle",
            description = listOf(
                "\u00a77A castle towers above",
                "\u00a77your team's island!"
            ),
            material = Material.STONE_SLAB2,
            rarity = CosmeticRarity.LEGENDARY
        )
    )

    fun find(id: String) = entries().firstOrNull { it.id == id }
}
