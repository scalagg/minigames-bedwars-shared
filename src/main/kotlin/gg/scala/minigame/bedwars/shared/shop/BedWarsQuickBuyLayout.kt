package gg.scala.minigame.bedwars.shared.shop

import gg.scala.minigame.bedwars.shared.hotbar.BedWarsHotbarLayout
import gg.scala.minigame.bedwars.shared.profile.BedWarsProfile

/**
 * @author Limo
 * @date 2/13/2026
 */
fun BedWarsProfile.bedWarsQuickBuyLayoutResolved() = BedWarsShopCatalog
    .normalizeQuickBuyLayout(quickBuyLayout)

/**
 * @author Limo
 * @date 2/13/2026
 */
fun BedWarsProfile.setBedWarsQuickBuyLayout(layout: Collection<String>)
{
    quickBuyLayout = BedWarsShopCatalog
        .normalizeQuickBuyLayout(layout)
}

/**
 * @author Limo
 * @date 2/16/2026
 */
fun BedWarsProfile.bedWarsHotbarLayoutResolved() = BedWarsHotbarLayout
    .normalizeLayout(hotbarLayout)

/**
 * @author Limo
 * @date 2/16/2026
 */
fun BedWarsProfile.setBedWarsHotbarLayout(layout: Map<String, Int>)
{
    updateHotbarLayout(layout)
}
