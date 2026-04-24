package gg.scala.minigame.bedwars.shared.cosmetic

import org.bukkit.Material

/**
 * @author Limo
 * @date 2/20/2026
 */
object VictoryDanceType
{
    fun entries(): List<CosmeticEntry> = listOf(
        CosmeticEntry(
            id = "none",
            displayName = "None",
            description = listOf("\u00a77No special celebration."),
            material = Material.BARRIER,
            rarity = CosmeticRarity.NONE
        ),
        CosmeticEntry(
            id = "fireworks",
            displayName = "Fireworks",
            description = listOf(
                "\u00a77Fireworks launch around",
                "\u00a77you after winning!"
            ),
            material = Material.FIREWORK,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "anvil_rain",
            displayName = "Anvil Rain",
            description = listOf(
                "\u00a77Anvils rain down from",
                "\u00a77the sky on all losers!"
            ),
            material = Material.ANVIL,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "cold_snap",
            displayName = "Cold Snap",
            description = listOf(
                "\u00a77A winter wonderland",
                "\u00a77spreads from your location!"
            ),
            material = Material.SNOW_BALL,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "dragon_rider",
            displayName = "Dragon Rider",
            description = listOf(
                "\u00a77An Ender Dragon circles",
                "\u00a77the map in celebration!"
            ),
            material = Material.DRAGON_EGG,
            rarity = CosmeticRarity.LEGENDARY
        ),
        CosmeticEntry(
            id = "guardians",
            displayName = "Guardians",
            description = listOf(
                "\u00a77Guardian beams shoot at",
                "\u00a77all losing players!"
            ),
            material = Material.PRISMARINE_SHARD,
            rarity = CosmeticRarity.EPIC
        ),
        CosmeticEntry(
            id = "haunted",
            displayName = "Haunted",
            description = listOf(
                "\u00a77Ghosts and bats swarm",
                "\u00a77around the battlefield!"
            ),
            material = Material.SKULL_ITEM,
            rarity = CosmeticRarity.EPIC
        ),
        CosmeticEntry(
            id = "raining_pigs",
            displayName = "Raining Pigs",
            description = listOf(
                "\u00a77Pigs rain from the sky",
                "\u00a77in celebration!"
            ),
            material = Material.PORK,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "wither_rider",
            displayName = "Wither Rider",
            description = listOf(
                "\u00a77Ride a Wither across",
                "\u00a77the map in glory!"
            ),
            material = Material.NETHER_STAR,
            rarity = CosmeticRarity.LEGENDARY
        ),
        CosmeticEntry(
            id = "floating_lantern",
            displayName = "Floating Lantern",
            description = listOf(
                "\u00a77Floating lanterns rise",
                "\u00a77into the sky around you!"
            ),
            material = Material.GLOWSTONE_DUST,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "night_shift",
            displayName = "Night Shift",
            description = listOf(
                "\u00a77The world cycles through",
                "\u00a77day and night rapidly!"
            ),
            material = Material.WATCH,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "rainbow_dolly",
            displayName = "Rainbow Dolly",
            description = listOf(
                "\u00a77Colorful sheep spawn around",
                "\u00a77you named Dolly!"
            ),
            material = Material.WOOL,
            materialData = 14,
            rarity = CosmeticRarity.EPIC
        ),
        CosmeticEntry(
            id = "toy_stick",
            displayName = "Toy Stick",
            description = listOf(
                "\u00a77Get a stick that launches",
                "\u00a77you sky high on right-click!"
            ),
            material = Material.STICK,
            rarity = CosmeticRarity.EPIC
        ),
        CosmeticEntry(
            id = "twerk_apocalypse",
            displayName = "Twerk Apocalypse",
            description = listOf(
                "\u00a77Sneak to spawn flowers",
                "\u00a77and bonemeal effects!"
            ),
            material = Material.YELLOW_FLOWER,
            rarity = CosmeticRarity.LEGENDARY
        ),
        CosmeticEntry(
            id = "yee_haw",
            displayName = "Yee Haw",
            description = listOf(
                "\u00a77Ride a speedy horse",
                "\u00a77around the map!"
            ),
            material = Material.SADDLE,
            rarity = CosmeticRarity.COMMON
        )
    )

    fun find(id: String) = entries().firstOrNull { it.id == id }
}
