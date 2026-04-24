package gg.scala.minigame.bedwars.shared.cosmetic

/**
 * @author Limo
 * @date 2/20/2026
 */
enum class CosmeticRarity(
    val displayName: String,
    val colorCode: String,
    val sortOrder: Int,
    val cost: Long
)
{
    LEGENDARY("Legendary", "\u00a76", 0, 10000L),
    EPIC("Epic", "\u00a75", 1, 5000L),
    RARE("Rare", "\u00a73", 2, 1500L),
    COMMON("Common", "\u00a7a", 3, 500L),
    NONE("None", "\u00a7a", 4, 0L),
    RANDOM("Random", "\u00a7d", 5, 0L);

    fun colored() = "$colorCode$displayName"

    fun isFree() = cost <= 0L
}
