package gg.scala.minigame.bedwars.shared.cosmetic

import org.bukkit.Material

/**
 * @author Limo
 * @date 2/20/2026
 */
object SprayType
{
    fun entries(): List<CosmeticEntry> = listOf(
        CosmeticEntry(
            id = "none",
            displayName = "None",
            description = listOf("\u00a77No spray."),
            material = Material.BARRIER,
            rarity = CosmeticRarity.NONE
        ),
        CosmeticEntry(
            id = "server-logo",
            displayName = "Server Logo",
            description = listOf(
                "\u00a77Spray the server logo",
                "\u00a77on walls and floors!"
            ),
            material = Material.BARRIER,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "diamond",
            displayName = "Diamond",
            description = listOf(
                "\u00a77Spray a diamond",
                "\u00a77on walls and floors!"
            ),
            material = Material.DIAMOND,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "creeper",
            displayName = "Creeper",
            description = listOf(
                "\u00a77Spray a creeper face",
                "\u00a77on walls and floors!"
            ),
            material = Material.SKULL_ITEM,
            materialData = 3,
            rarity = CosmeticRarity.COMMON,
            skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjQyNTQ4MzhlMzMyOTAzOGI4YjE3ODdhYTRlMzU4ZTc2M2UxN2M5YzIzMWRjMGQ1ODE0MWU0ZjJlMGM0MDQifX19"
        ),
        CosmeticEntry(
            id = "thanks",
            displayName = "Thanks",
            description = listOf(
                "\u00a77Spray a thanks sign",
                "\u00a77on walls and floors!"
            ),
            material = Material.SKULL_ITEM,
            materialData = 3,
            rarity = CosmeticRarity.COMMON,
            skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDdmNTZhMTRlMDcwNjAxMDczYjFjYTdmMjA0NWRmMjdiMmQ2OGMzNGNjYzM0MTlkYWI1MjU2ZGQxMWQ4MTcifX19"
        ),
        CosmeticEntry(
            id = "invisibility-potion",
            displayName = "Invisibility Potion",
            description = listOf(
                "\u00a77Spray an invisibility potion",
                "\u00a77on walls and floors!"
            ),
            material = Material.GLASS_BOTTLE,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "disco-pumpkin",
            displayName = "Disco Pumpkin",
            description = listOf(
                "\u00a77Spray a disco pumpkin",
                "\u00a77on walls and floors!"
            ),
            material = Material.PUMPKIN,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "reveillion",
            displayName = "Reveillion",
            description = listOf(
                "\u00a77Spray a reveillion feast",
                "\u00a77on walls and floors!"
            ),
            material = Material.COOKED_CHICKEN,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "christmas-tree",
            displayName = "Christmas Tree",
            description = listOf(
                "\u00a77Spray a christmas tree",
                "\u00a77on walls and floors!"
            ),
            material = Material.SAPLING,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "easter-eggs",
            displayName = "Easter Eggs",
            description = listOf(
                "\u00a77Spray easter eggs",
                "\u00a77on walls and floors!"
            ),
            material = Material.SKULL_ITEM,
            materialData = 3,
            rarity = CosmeticRarity.COMMON,
            skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTljODg0NjllMmQxNmNhZDE5M2RhYTcwZTIzZGI5Y2NhZDQxNTEzZGE2YjllNjgyOGFmNDU5MjFiOTkwODhiYiJ9fX0="
        ),
        CosmeticEntry(
            id = "careful-santa",
            displayName = "Careful Santa",
            description = listOf(
                "\u00a77Spray a careful Santa",
                "\u00a77on walls and floors!"
            ),
            material = Material.SKULL_ITEM,
            materialData = 3,
            rarity = CosmeticRarity.COMMON,
            skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjVkZGNjZDFjNWUyMmFhNTgwMjhlNGMyMTRkN2U2MzFhODQ5ZTk5NmI2NjYxYjdhNGQ3NjFiZTQxZTk1OGMzMiJ9fX0="
        ),
        CosmeticEntry(
            id = "bunny-gg",
            displayName = "Bunny GG",
            description = listOf(
                "\u00a77Spray a bunny GG",
                "\u00a77on walls and floors!"
            ),
            material = Material.SKULL_ITEM,
            materialData = 3,
            rarity = CosmeticRarity.COMMON,
            skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjBkMTVjZThlZjhhYmVmMGEzODRmMmRhYTc1YzllYjMzZmJlYjQ5YjRkMTZhNTU3OGUwZGM0MTJkNmUzIn19fQ=="
        ),
        CosmeticEntry(
            id = "fireworks",
            displayName = "Fireworks",
            description = listOf(
                "\u00a77Spray fireworks",
                "\u00a77on walls and floors!"
            ),
            material = Material.FIREWORK,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "year-of-the-dog",
            displayName = "Year of the Dog",
            description = listOf(
                "\u00a77Spray a year of the dog",
                "\u00a77on walls and floors!"
            ),
            material = Material.BONE,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "year-of-the-pig",
            displayName = "Year of the Pig",
            description = listOf(
                "\u00a77Spray a year of the pig",
                "\u00a77on walls and floors!"
            ),
            material = Material.CARROT_STICK,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "lantern",
            displayName = "Lantern",
            description = listOf(
                "\u00a77Spray a lantern",
                "\u00a77on walls and floors!"
            ),
            material = Material.SKULL_ITEM,
            materialData = 3,
            rarity = CosmeticRarity.COMMON,
            skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjdiOGVmMjg0N2FmNTk0MTg3NDFhNjNiNTNmNWU2YzhmOGVjODllYjY4OTQ4ZDhhOGQ3OTg3MjJiYzYzZjNkNiJ9fX0="
        ),
        CosmeticEntry(
            id = "year-of-the-rat",
            displayName = "Year of the Rat",
            description = listOf(
                "\u00a77Spray a year of the rat",
                "\u00a77on walls and floors!"
            ),
            material = Material.SKULL_ITEM,
            materialData = 3,
            rarity = CosmeticRarity.COMMON,
            skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTE4NTBkNmQxODM2NjJhNTYyYzFiZTQ1MTJkZjMzNjhiNjNhNTNlNmMyNGIzZGNmYjUyNTc4ZTBlM2Q1NjcifX19"
        ),
        CosmeticEntry(
            id = "year-of-the-ox",
            displayName = "Year of the Ox",
            description = listOf(
                "\u00a77Spray a year of the ox",
                "\u00a77on walls and floors!"
            ),
            material = Material.RAW_BEEF,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "lion-dancer",
            displayName = "Lion Dancer",
            description = listOf(
                "\u00a77Spray a lion dancer",
                "\u00a77on walls and floors!"
            ),
            material = Material.SADDLE,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "year-of-the-tiger",
            displayName = "Year of the Tiger",
            description = listOf(
                "\u00a77Spray a year of the tiger",
                "\u00a77on walls and floors!"
            ),
            material = Material.SKULL_ITEM,
            materialData = 3,
            rarity = CosmeticRarity.COMMON,
            skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODIzNjU1MzFjNjQ4NjdiODc1YjUzNzVlMThkYTgxMjlhOGJmMjdjZDYyNTE2ZmFhNjMzMjEyNzZmZTBlNWVmOCJ9fX0="
        ),
        CosmeticEntry(
            id = "sorry",
            displayName = "Sorry",
            description = listOf(
                "\u00a77Spray a sorry sign",
                "\u00a77on walls and floors!"
            ),
            material = Material.SKULL_ITEM,
            materialData = 3,
            rarity = CosmeticRarity.COMMON,
            skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNThmMTMzOWRhMDlhNzIyMTlhNmEzOWY4NWQ5NjUxODdmNmVmNWM2N2MxNGM0ZmJmNWYzOWE1MWQyMGQ0MyJ9fX0="
        ),
        CosmeticEntry(
            id = "enderman",
            displayName = "Enderman",
            description = listOf(
                "\u00a77Spray an enderman",
                "\u00a77on walls and floors!"
            ),
            material = Material.SKULL_ITEM,
            materialData = 3,
            rarity = CosmeticRarity.COMMON,
            skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E1OWJiMGE3YTMyOTY1YjNkOTBkOGVhZmE4OTlkMTczMmY4NWRmNjc2ZjAyMzY4NWQ1YjFjNWUwMTVlNSJ9fX0="
        )
    )

    fun find(id: String) = entries().firstOrNull { it.id == id }
}
