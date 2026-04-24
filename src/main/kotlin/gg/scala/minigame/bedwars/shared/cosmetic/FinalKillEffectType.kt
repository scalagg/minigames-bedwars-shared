package gg.scala.minigame.bedwars.shared.cosmetic

import org.bukkit.Material

/**
 * @author Limo
 * @date 2/20/2026
 */
object FinalKillEffectType
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
            id = "lightning_strike",
            displayName = "Lightning Strike",
            description = listOf(
                "\u00a77A lightning bolt strikes",
                "\u00a77at the death location!"
            ),
            material = Material.GOLD_INGOT,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "firework",
            displayName = "Firework",
            description = listOf(
                "\u00a77A firework launches from",
                "\u00a77the death location!"
            ),
            material = Material.FIREWORK,
            rarity = CosmeticRarity.COMMON
        ),
        CosmeticEntry(
            id = "heart_aura",
            displayName = "Heart Aura",
            description = listOf(
                "\u00a77Hearts float upward from",
                "\u00a77the death location!"
            ),
            material = Material.RED_ROSE,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "tornado",
            displayName = "Tornado",
            description = listOf(
                "\u00a77A swirling tornado forms",
                "\u00a77at the death location!"
            ),
            material = Material.WEB,
            rarity = CosmeticRarity.RARE
        ),
        CosmeticEntry(
            id = "bat_crux",
            displayName = "Bat Crux",
            description = listOf(
                "\u00a77A swarm of bats erupts",
                "\u00a77from the death location!"
            ),
            material = Material.COAL,
            rarity = CosmeticRarity.EPIC
        ),
        CosmeticEntry(
            id = "burning_shoes",
            displayName = "Burning Shoes",
            description = listOf(
                "\u00a77Burning boots appear where",
                "\u00a77the player was eliminated!"
            ),
            material = Material.LEATHER_BOOTS,
            rarity = CosmeticRarity.EPIC
        ),
        CosmeticEntry(
            id = "rekt",
            displayName = "Rekt",
            description = listOf(
                "\u00a77A giant 'REKT' hologram",
                "\u00a77appears at the death location!"
            ),
            material = Material.NAME_TAG,
            rarity = CosmeticRarity.LEGENDARY
        ),
        CosmeticEntry(
            id = "squid_missile",
            displayName = "Squid Missile",
            description = listOf(
                "\u00a77A squid launches upward",
                "\u00a77like a rocket!"
            ),
            material = Material.INK_SACK,
            rarity = CosmeticRarity.LEGENDARY
        )
    )

    fun find(id: String) = entries().firstOrNull { it.id == id }
}
