package gg.scala.minigame.bedwars.shared.shop

import gg.tropic.practice.currency.ShopCurrency
import org.bukkit.Material

/**
 * @author Limo
 * @date 2/13/2026
 */
enum class BedWarsPickaxeTier(
    val displayName: String,
    val material: Material,
    val purchaseCurrency: ShopCurrency,
    val purchaseCost: Int
)
{
    Wood(
        displayName = "Wooden Pickaxe (Efficiency I)",
        material = Material.WOOD_PICKAXE,
        purchaseCurrency = ShopCurrency.Iron,
        purchaseCost = 10
    ),
    Iron(
        displayName = "Iron Pickaxe (Efficiency II)",
        material = Material.IRON_PICKAXE,
        purchaseCurrency = ShopCurrency.Iron,
        purchaseCost = 10
    ),
    Gold(
        displayName = "Golden Pickaxe (Efficiency III)",
        material = Material.GOLD_PICKAXE,
        purchaseCurrency = ShopCurrency.Gold,
        purchaseCost = 3
    ),
    Diamond(
        displayName = "Diamond Pickaxe (Efficiency III)",
        material = Material.DIAMOND_PICKAXE,
        purchaseCurrency = ShopCurrency.Gold,
        purchaseCost = 6
    );

    companion object
    {
        fun fromLevel(level: Int) = entries.getOrNull(level - 1)
        fun nextFrom(level: Int) = entries.getOrNull(level)
    }
}
