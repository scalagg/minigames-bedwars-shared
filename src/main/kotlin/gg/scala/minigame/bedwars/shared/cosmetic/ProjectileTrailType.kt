package gg.scala.minigame.bedwars.shared.cosmetic

import org.bukkit.Material

/**
 * @author Limo
 * @date 2/20/2026
 */
object ProjectileTrailType
{
    fun entries(): List<CosmeticEntry> = listOf(
        CosmeticEntry(
            id = "none",
            displayName = "None",
            description = listOf("\u00a77No particle trail."),
            material = Material.BARRIER,
            rarity = CosmeticRarity.NONE
        ),
        CosmeticEntry(
            id = "slime",
            displayName = "Slime",
            description = listOf(
                "\u00a77Your projectiles leave",
                "\u00a77a trail of slime!"
            ),
            material = Material.SLIME_BALL,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "ender",
            displayName = "Ender",
            description = listOf(
                "\u00a77Your projectiles leave",
                "\u00a77an ender trail!"
            ),
            material = Material.EYE_OF_ENDER,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "lava",
            displayName = "Lava",
            description = listOf(
                "\u00a77Your projectiles leave",
                "\u00a77a trail of lava!"
            ),
            material = Material.LAVA_BUCKET,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "potion",
            displayName = "Potion",
            description = listOf(
                "\u00a77Your projectiles leave",
                "\u00a77a potion swirl trail!"
            ),
            material = Material.GLASS_BOTTLE,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "water",
            displayName = "Water",
            description = listOf(
                "\u00a77Your projectiles leave",
                "\u00a77a trail of water drops!"
            ),
            material = Material.WATER_BUCKET,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "black-smoke",
            displayName = "Black Smoke",
            description = listOf(
                "\u00a77Your projectiles leave",
                "\u00a77a trail of black smoke!"
            ),
            material = Material.FURNACE,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "white-smoke",
            displayName = "White Smoke",
            description = listOf(
                "\u00a77Your projectiles leave",
                "\u00a77a trail of white smoke!"
            ),
            material = Material.SNOW_BLOCK,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "note",
            displayName = "Note",
            description = listOf(
                "\u00a77Your projectiles leave",
                "\u00a77a trail of music notes!"
            ),
            material = Material.NOTE_BLOCK,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "blue-dust",
            displayName = "Blue Dust",
            description = listOf(
                "\u00a77Your projectiles leave",
                "\u00a77a trail of blue dust!"
            ),
            material = Material.INK_SACK,
            materialData = 4,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "red-dust",
            displayName = "Red Dust",
            description = listOf(
                "\u00a77Your projectiles leave",
                "\u00a77a trail of red dust!"
            ),
            material = Material.REDSTONE,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "purple-dust",
            displayName = "Purple Dust",
            description = listOf(
                "\u00a77Your projectiles leave",
                "\u00a77a trail of purple dust!"
            ),
            material = Material.INK_SACK,
            materialData = 5,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "fire",
            displayName = "Fire",
            description = listOf(
                "\u00a77Your projectiles leave",
                "\u00a77a trail of flames!"
            ),
            material = Material.FLINT,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "magic",
            displayName = "Magic",
            description = listOf(
                "\u00a77Your projectiles leave",
                "\u00a77a magical trail!"
            ),
            material = Material.CAULDRON_ITEM,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "firework",
            displayName = "Firework",
            description = listOf(
                "\u00a77Your projectiles leave",
                "\u00a77a firework spark trail!"
            ),
            material = Material.FIREWORK,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "angry-villager",
            displayName = "Angry Villager",
            description = listOf(
                "\u00a77Your projectiles leave",
                "\u00a77angry villager clouds!"
            ),
            material = Material.IRON_SWORD,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "happy-villager",
            displayName = "Happy Villager",
            description = listOf(
                "\u00a77Your projectiles leave",
                "\u00a77happy villager particles!"
            ),
            material = Material.GOLD_INGOT,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "portal",
            displayName = "Portal",
            description = listOf(
                "\u00a77Your projectiles leave",
                "\u00a77portal particles!"
            ),
            material = Material.OBSIDIAN,
            rarity = CosmeticRarity.RARE
        )
    )

    fun find(id: String) = entries().firstOrNull { it.id == id }
}
