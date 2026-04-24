package gg.scala.minigame.bedwars.shared.profile

import gg.scala.minigame.bedwars.shared.hotbar.BedWarsHotbarLayout
import gg.scala.minigame.bedwars.shared.shop.BedWarsShopCatalog
import gg.scala.store.controller.DataStoreObjectControllerCache
import gg.scala.store.storage.storable.IDataStoreObject
import gg.scala.store.storage.type.DataStoreStorageType
import java.util.UUID

/**
 * @author Limo
 * @date 2/13/2026
 */
data class BedWarsProfile(
    override val identifier: UUID,
    var quickBuyLayout: MutableList<String> = BedWarsShopCatalog
        .defaultQuickBuyLayout
        .toMutableList(),
    var hotbarLayout: MutableMap<String, Int> = BedWarsHotbarLayout
        .defaultLayout
        .toMutableMap(),
    var selectedFinalKillEffect: String = "none",
    var selectedBedBreakEffect: String = "none",
    var selectedVictoryDance: String = "none",
    var selectedDeathCry: String = "none",
    var selectedProjectileTrail: String = "none",
    var selectedKillMessage: String = "none",
    var selectedGlyph: String = "none",
    var selectedSpray: String = "none",
    var selectedWoodSkin: String = "none",
    var selectedShopKeeperSkin: String = "none",
    var selectedIslandTopper: String = "none",
    var ownedCosmetics: MutableMap<String, MutableList<String>> = mutableMapOf()
) : IDataStoreObject
{
    fun resolveQuickBuyLayout() = BedWarsShopCatalog
        .normalizeQuickBuyLayout(quickBuyLayout)

    fun setQuickBuyLayout(layout: Collection<String>)
    {
        quickBuyLayout = BedWarsShopCatalog
            .normalizeQuickBuyLayout(layout)
    }

    fun resolveHotbarLayout() = BedWarsHotbarLayout
        .normalizeLayout(hotbarLayout)

    fun updateHotbarLayout(layout: Map<String, Int>)
    {
        hotbarLayout = BedWarsHotbarLayout
            .normalizeLayout(layout)
    }

    fun save() = DataStoreObjectControllerCache
        .findNotNull<BedWarsProfile>()
        .save(this, DataStoreStorageType.MONGO)
}
