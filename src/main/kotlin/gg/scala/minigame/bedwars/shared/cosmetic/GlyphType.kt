package gg.scala.minigame.bedwars.shared.cosmetic

import org.bukkit.Material

/**
 * @author Limo
 * @date 2/20/2026
 */
object GlyphType
{
    fun entries(): List<CosmeticEntry> = listOf(
        CosmeticEntry(
            id = "none",
            displayName = "None",
            description = listOf("\u00a77No glyph displayed."),
            material = Material.BARRIER,
            rarity = CosmeticRarity.NONE
        ),
        CosmeticEntry(
            id = "iron",
            displayName = "Iron",
            description = listOf(
                "\u00a77An iron glyph appears",
                "\u00a77above your head on final kill!"
            ),
            material = Material.IRON_INGOT,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "gold",
            displayName = "Gold",
            description = listOf(
                "\u00a77A gold glyph appears",
                "\u00a77above your head on final kill!"
            ),
            material = Material.GOLD_INGOT,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "thumbsup",
            displayName = "Thumbs Up",
            description = listOf(
                "\u00a77A thumbs up glyph appears",
                "\u00a77above your head on final kill!"
            ),
            material = Material.SKULL_ITEM,
            materialData = 3,
            rarity = CosmeticRarity.COMMON,
            skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTk5YWFmMjQ1NmE2MTIyZGU4ZjZiNjI2ODNmMmJjMmVlZDlhYmI4MWZkNWJlYTFiNGMyM2E1ODE1NmI2NjkifX19"
        ),
        CosmeticEntry(
            id = "thumbsdown",
            displayName = "Thumbs Down",
            description = listOf(
                "\u00a77A thumbs down glyph appears",
                "\u00a77above your head on final kill!"
            ),
            material = Material.SKULL_ITEM,
            materialData = 3,
            rarity = CosmeticRarity.COMMON,
            skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzkxMmQ0NWIxYzc4Y2MyMjQ1MjcyM2VlNjZiYTJkMTU3NzdjYzI4ODU2OGQ2YzFiNjJhNTQ1YjI5YzcxODcifX19"
        ),
        CosmeticEntry(
            id = "sword",
            displayName = "Sword",
            description = listOf(
                "\u00a77A sword glyph appears",
                "\u00a77above your head on final kill!"
            ),
            material = Material.WOOD_SWORD,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "storm",
            displayName = "Storm",
            description = listOf(
                "\u00a77A storm glyph appears",
                "\u00a77above your head on final kill!"
            ),
            material = Material.SKULL_ITEM,
            materialData = 3,
            rarity = CosmeticRarity.COMMON,
            skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzNkNjlhNjBkOTcwYWQwYjhhYTE1ODk3OTE0ZjVhYWMyNjVlOTllNmY1MDE2YTdkOGFhN2JlOWFjMDNiNjE0OCJ9fX0="
        ),
        CosmeticEntry(
            id = "burn",
            displayName = "Burn",
            description = listOf(
                "\u00a77A burn glyph appears",
                "\u00a77above your head on final kill!"
            ),
            material = Material.LAVA_BUCKET,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "bronze-shield",
            displayName = "Bronze Shield",
            description = listOf(
                "\u00a77A bronze shield glyph appears",
                "\u00a77above your head on final kill!"
            ),
            material = Material.SKULL_ITEM,
            materialData = 3,
            rarity = CosmeticRarity.COMMON,
            skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTU0OTQ3ZGU3ZjUyNTk4MjU1ZDZhZmVlOWQ3N2JlZmFkOWI0ZjI0YzBjNDY2M2QyOGJjZGY4YTY0NTdmMzQifX19"
        )
    )

    fun find(id: String) = entries().firstOrNull { it.id == id }
}
