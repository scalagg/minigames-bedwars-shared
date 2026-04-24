package gg.scala.minigame.bedwars.shared.shop

import gg.tropic.practice.currency.ShopCurrency
import org.bukkit.Material

/**
 * @author Limo
 * @date 2/13/2026
 */
enum class BedWarsShopPurchaseType
{
    Standard,
    PermanentPickaxe,
    PermanentAxe,
    PermanentShears,
    ArmorChainmail,
    ArmorIron,
    ArmorDiamond,
    SpeedPotion,
    JumpPotion,
    InvisibilityPotion,
    KnockbackStick,
    WaterBucket,
    BridgeEgg,
    Sponge,
    CompactPop,
    DreamDefender,
    BowPower,
    BowPunch,
    MagicMilk,
    Bedbug,
    Rotational
}

/**
 * @author Limo
 * @date 2/13/2026
 */
data class BedWarsShopEntry(
    val id: String,
    val displayName: String,
    val category: BedWarsShopCategory,
    val icon: Material,
    val currency: ShopCurrency,
    val cost: Int,
    val amount: Int = 1,
    val data: Short = 0,
    val quickBuyEligible: Boolean = true,
    val purchaseType: BedWarsShopPurchaseType = BedWarsShopPurchaseType.Standard
)
