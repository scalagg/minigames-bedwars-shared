package gg.scala.minigame.bedwars.shared.cosmetic

import org.bukkit.Material

/**
 * @author Limo
 * @date 2/20/2026
 */
object BedBreakEffectType
{
    fun entries(): List<CosmeticEntry> = listOf(
        CosmeticEntry(
            id = "none",
            displayName = "None",
            description = listOf("\u00a77No special effect."),
            material = Material.BARRIER,
            rarity = CosmeticRarity.NONE
        ),
        CosmeticEntry(
            id = "fireworks",
            displayName = "Fireworks",
            description = listOf(
                "\u00a77Fireworks explode at the",
                "\u00a77destroyed bed location!"
            ),
            material = Material.FIREWORK,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "lightning_strike",
            displayName = "Lightning Strike",
            description = listOf(
                "\u00a77Lightning strikes the bed",
                "\u00a77when it's destroyed!"
            ),
            material = Material.GOLD_INGOT,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "bed_bugs",
            displayName = "Bed Bugs",
            description = listOf(
                "\u00a77Silverfish swarm out from",
                "\u00a77the broken bed!"
            ),
            material = Material.MONSTER_EGG,
            materialData = 60,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "egg_explosion",
            displayName = "Egg Explosion",
            description = listOf(
                "\u00a77Eggs burst out from the",
                "\u00a77broken bed location!"
            ),
            material = Material.EGG,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "tornado",
            displayName = "Tornado",
            description = listOf(
                "\u00a77A tornado swirls around",
                "\u00a77the broken bed!"
            ),
            material = Material.WEB,
            rarity = CosmeticRarity.EPIC
        ),
        CosmeticEntry(
            id = "pig_missile",
            displayName = "Pig Missile",
            description = listOf(
                "\u00a77A pig launches skyward",
                "\u00a77from the broken bed!"
            ),
            material = Material.PORK,
            rarity = CosmeticRarity.EPIC
        ),
        CosmeticEntry(
            id = "squid_missile",
            displayName = "Squid Missile",
            description = listOf(
                "\u00a77A squid launches skyward",
                "\u00a77from the broken bed!"
            ),
            material = Material.INK_SACK,
            rarity = CosmeticRarity.LEGENDARY
        ),
        CosmeticEntry(
            id = "ghost",
            displayName = "Ghost",
            description = listOf(
                "\u00a77Spooky ghosts swarm around",
                "\u00a77the broken bed and explode!"
            ),
            material = Material.SKULL_ITEM,
            materialData = 1,
            rarity = CosmeticRarity.EPIC
        ),
        CosmeticEntry(
            id = "hologram",
            displayName = "Hologram",
            description = listOf(
                "\u00a77A hologram message appears",
                "\u00a77at the broken bed location!"
            ),
            material = Material.NAME_TAG,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "thief",
            displayName = "Thief",
            description = listOf(
                "\u00a77An Enderman steals the bed",
                "\u00a77and runs away with it!"
            ),
            material = Material.ENDER_PEARL,
            rarity = CosmeticRarity.EPIC
        ),
        CosmeticEntry(
            id = "random",
            displayName = "Random",
            description = listOf(
                "\u00a77A random bed break effect",
                "\u00a77plays each time!"
            ),
            material = Material.COMMAND,
            rarity = CosmeticRarity.RANDOM
        )
    )

    fun find(id: String) = entries().firstOrNull { it.id == id }
}
