package gg.scala.minigame.bedwars.shared.shop

/**
 * @author Limo
 * @date 2/13/2026
 */
object BedWarsQuickBuySlots
{
    val menuSlots = listOf(10..16, 19..25, 28..34)
        .flatMap { range -> range.toList() }
}
