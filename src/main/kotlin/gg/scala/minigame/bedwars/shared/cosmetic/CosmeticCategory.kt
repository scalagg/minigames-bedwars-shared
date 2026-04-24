package gg.scala.minigame.bedwars.shared.cosmetic

import gg.scala.minigame.bedwars.shared.profile.BedWarsProfile
import org.bukkit.Material

/**
 * @author Limo
 * @date 2/20/2026
 */
enum class CosmeticCategory(
    val displayName: String,
    val description: List<String>,
    val iconMaterial: Material,
    val iconData: Short = 0,
    val menuSlot: Int,
    val previewable: Boolean = false,
    val skullTexture: String? = null,
    val getter: (BedWarsProfile) -> String,
    val setter: (BedWarsProfile, String) -> Unit,
    val entries: () -> List<CosmeticEntry>
)
{
    PROJECTILE_TRAILS(
        displayName = "Projectile Trails",
        description = listOf(
            "\u00a77Add particle trails to",
            "\u00a77your projectiles!"
        ),
        iconMaterial = Material.ARROW,
        menuSlot = 9,
        previewable = true,
        getter = { it.selectedProjectileTrail },
        setter = { profile, id -> profile.selectedProjectileTrail = id },
        entries = { ProjectileTrailType.entries() }
    ),
    VICTORY_DANCES(
        displayName = "Victory Dances",
        description = listOf(
            "\u00a77Dance your way to victory",
            "\u00a77with a celebration dance!"
        ),
        iconMaterial = Material.SKULL_ITEM,
        iconData = 3,
        menuSlot = 11,
        previewable = true,
        skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGM5ZjhlMTAwYWYyMDBlMmM0YjdkOGQ3N2I5MWJlNTYyZGEwMTM2YzBiMGNhZmE4MWIzN2JkYTM0MTM1ZGYxIn19fQ==",
        getter = { it.selectedVictoryDance },
        setter = { profile, id -> profile.selectedVictoryDance = id },
        entries = { VictoryDanceType.entries() }
    ),
    FINAL_KILL_EFFECTS(
        displayName = "Final Kill Effects",
        description = listOf(
            "\u00a77Show off with a flashy",
            "\u00a77effect when you get a final kill!"
        ),
        iconMaterial = Material.IRON_SWORD,
        menuSlot = 13,
        previewable = true,
        getter = { it.selectedFinalKillEffect },
        setter = { profile, id -> profile.selectedFinalKillEffect = id },
        entries = { FinalKillEffectType.entries() }
    ),
    SPRAYS(
        displayName = "Sprays",
        description = listOf(
            "\u00a77Spray images on walls",
            "\u00a77and floors in the lobby!"
        ),
        iconMaterial = Material.PAPER,
        menuSlot = 15,
        getter = { it.selectedSpray },
        setter = { profile, id -> profile.selectedSpray = id },
        entries = { SprayType.entries() }
    ),
    ISLAND_TOPPERS(
        displayName = "Island Toppers",
        description = listOf(
            "\u00a77Place a structure above",
            "\u00a77your team's island!"
        ),
        iconMaterial = Material.SKULL_ITEM,
        iconData = 3,
        menuSlot = 17,
        skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzc1NjU5YTdiMWQwZDljMjY4YzcwZDliOTJlODE2ZmNkMjhlMzFhNTg4OTYzZDRhMDUwY2VlODVlYzk0MjI0MCJ9fX0=",
        getter = { it.selectedIslandTopper },
        setter = { profile, id -> profile.selectedIslandTopper = id },
        entries = { IslandTopperType.entries() }
    ),
    DEATH_CRIES(
        displayName = "Death Cries",
        description = listOf(
            "\u00a77Play a dramatic sound",
            "\u00a77when you die!"
        ),
        iconMaterial = Material.SKULL_ITEM,
        iconData = 3,
        menuSlot = 22,
        previewable = true,
        skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjM3MWU0ZTFjZjZhMWEzNmZkYWUyNzEzN2ZkOWI4NzQ4ZTYxNjkyOTk5MjVmOWFmMmJlMzAxZTU0Mjk4YzczIn19fQ==",
        getter = { it.selectedDeathCry },
        setter = { profile, id -> profile.selectedDeathCry = id },
        entries = { DeathCryType.entries() }
    ),
    SHOPKEEPER_SKINS(
        displayName = "Shopkeeper Skins",
        description = listOf(
            "\u00a77Change the entity type of",
            "\u00a77your team's shop NPC!"
        ),
        iconMaterial = Material.SKULL_ITEM,
        iconData = 3,
        menuSlot = 27,
        previewable = true,
        skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGNhOGVmMjQ1OGEyYjEwMjYwYjg3NTY1NThmNzY3OWJjYjdlZjY5MWQ0MWY1MzRlZmVhMmJhNzUxMDczMTVjYyJ9fX0=",
        getter = { it.selectedShopKeeperSkin },
        setter = { profile, id -> profile.selectedShopKeeperSkin = id },
        entries = { ShopKeeperSkinType.entries() }
    ),
    KILL_MESSAGES(
        displayName = "Kill Messages",
        description = listOf(
            "\u00a77Customize the message",
            "\u00a77shown when you kill someone!"
        ),
        iconMaterial = Material.SIGN,
        menuSlot = 29,
        previewable = true,
        getter = { it.selectedKillMessage },
        setter = { profile, id -> profile.selectedKillMessage = id },
        entries = { KillMessageType.entries() }
    ),
    GLYPHS(
        displayName = "Glyphs",
        description = listOf(
            "\u00a77Display a particle glyph",
            "\u00a77above your head on final kill!"
        ),
        iconMaterial = Material.DIAMOND,
        menuSlot = 31,
        previewable = true,
        getter = { it.selectedGlyph },
        setter = { profile, id -> profile.selectedGlyph = id },
        entries = { GlyphType.entries() }
    ),
    BED_BREAK_EFFECTS(
        displayName = "Bed Break Effects",
        description = listOf(
            "\u00a77Celebrate with a special",
            "\u00a77effect when you break a bed!"
        ),
        iconMaterial = Material.BED,
        menuSlot = 33,
        previewable = true,
        getter = { it.selectedBedBreakEffect },
        setter = { profile, id -> profile.selectedBedBreakEffect = id },
        entries = { BedBreakEffectType.entries() }
    ),
    WOOD_SKINS(
        displayName = "Wood Skins",
        description = listOf(
            "\u00a77Change the look of wood",
            "\u00a77blocks you place in-game!"
        ),
        iconMaterial = Material.WOOD,
        iconData = 5,
        menuSlot = 35,
        getter = { it.selectedWoodSkin },
        setter = { profile, id -> profile.selectedWoodSkin = id },
        entries = { WoodSkinType.entries() }
    );

    fun selectedId(profile: BedWarsProfile) = getter(profile)

    fun select(profile: BedWarsProfile, id: String)
    {
        setter(profile, id)
    }
}
