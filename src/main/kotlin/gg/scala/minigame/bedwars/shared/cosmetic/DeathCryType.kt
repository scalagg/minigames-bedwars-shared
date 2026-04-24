package gg.scala.minigame.bedwars.shared.cosmetic

import org.bukkit.Material

/**
 * @author Limo
 * @date 2/20/2026
 */
object DeathCryType
{
    fun entries(): List<CosmeticEntry> = listOf(
        CosmeticEntry(
            id = "none",
            displayName = "None",
            description = listOf("\u00a77No death cry."),
            material = Material.BARRIER,
            rarity = CosmeticRarity.NONE
        ),
        CosmeticEntry(
            id = "bazinga",
            displayName = "Bazinga",
            description = listOf(
                "\u00a77A blazing death sound",
                "\u00a77plays when you die!"
            ),
            material = Material.SKULL_ITEM,
            materialData = 3,
            rarity = CosmeticRarity.COMMON,
            skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2I4N2QyMjUyY2FjMWFhMTVkZjMyNTk5OGI4ZWM4MmVmOTEwOWI2YzU2NzYxMGFmYWMwZWNkYTUxM2Y2MSJ9fX0="
        ),
        CosmeticEntry(
            id = "enderman",
            displayName = "Enderman",
            description = listOf(
                "\u00a77An enderman death sound",
                "\u00a77plays when you die!"
            ),
            material = Material.EYE_OF_ENDER,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "pig",
            displayName = "Pig",
            description = listOf(
                "\u00a77A pig death sound",
                "\u00a77plays when you die!"
            ),
            material = Material.RAW_BEEF,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "bat",
            displayName = "Bat",
            description = listOf(
                "\u00a77A bat death sound",
                "\u00a77plays when you die!"
            ),
            material = Material.MONSTER_EGG,
            materialData = 65,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "skeleton",
            displayName = "Skeleton",
            description = listOf(
                "\u00a77A skeleton death sound",
                "\u00a77plays when you die!"
            ),
            material = Material.MONSTER_EGG,
            materialData = 51,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "wolf",
            displayName = "Wolf",
            description = listOf(
                "\u00a77A wolf howl sound",
                "\u00a77plays when you die!"
            ),
            material = Material.MONSTER_EGG,
            materialData = 95,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "burp",
            displayName = "Burp",
            description = listOf(
                "\u00a77A burp sound plays",
                "\u00a77when you die!"
            ),
            material = Material.COOKED_BEEF,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "firework",
            displayName = "Firework",
            description = listOf(
                "\u00a77A firework launch sound",
                "\u00a77plays when you die!"
            ),
            material = Material.FIREWORK,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "splash",
            displayName = "Splash",
            description = listOf(
                "\u00a77A splash sound plays",
                "\u00a77when you die!"
            ),
            material = Material.WATER_BUCKET,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "sad-puppy",
            displayName = "Sad Puppy",
            description = listOf(
                "\u00a77A sad wolf death sound",
                "\u00a77plays when you die!"
            ),
            material = Material.BONE,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "sad-moo",
            displayName = "Sad Moo",
            description = listOf(
                "\u00a77A sad cow sound plays",
                "\u00a77when you die!"
            ),
            material = Material.MUTTON,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "plop",
            displayName = "Plop",
            description = listOf(
                "\u00a77A plop sound plays",
                "\u00a77when you die!"
            ),
            material = Material.EGG,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "ding",
            displayName = "Ding",
            description = listOf(
                "\u00a77A ding sound plays",
                "\u00a77when you die!"
            ),
            material = Material.SKULL_ITEM,
            materialData = 3,
            rarity = CosmeticRarity.RARE,
            skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmI1MDQ5MzVhYzRhNWQ5MzRhNzgyOGMxN2QzYWYyZDdiOTczMDY5NWU1YTVmYWMxODlhNzRhZDFlNzY5NDBhYyJ9fX0="
        ),
        CosmeticEntry(
            id = "fireball",
            displayName = "Fireball",
            description = listOf(
                "\u00a77A fireball sound plays",
                "\u00a77when you die!"
            ),
            material = Material.FIREBALL,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "explode",
            displayName = "Explode",
            description = listOf(
                "\u00a77An explosion sound plays",
                "\u00a77when you die!"
            ),
            material = Material.TNT,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "zombie",
            displayName = "Zombie",
            description = listOf(
                "\u00a77A zombie scream plays",
                "\u00a77when you die!"
            ),
            material = Material.MONSTER_EGG,
            materialData = 54,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "breath",
            displayName = "Breath",
            description = listOf(
                "\u00a77A breathing sound plays",
                "\u00a77when you die!"
            ),
            material = Material.BOWL,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "click",
            displayName = "Click",
            description = listOf(
                "\u00a77A click sound plays",
                "\u00a77when you die!"
            ),
            material = Material.WOOD_BUTTON,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "creepy",
            displayName = "Creepy",
            description = listOf(
                "\u00a77A creepy cave sound plays",
                "\u00a77when you die!"
            ),
            material = Material.SKULL_ITEM,
            materialData = 3,
            rarity = CosmeticRarity.RARE,
            skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGQ0N2RiNzIxOTI3NDE0OTVlMTU3ZjRhYmZjMmFlMTIwMmQyOTI1MGVhMDA0N2E1MmZjODIwNDA4OWUxOGUxMCJ9fX0="
        )
    )

    fun find(id: String) = entries().firstOrNull { it.id == id }
}
