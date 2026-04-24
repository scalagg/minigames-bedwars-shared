package gg.scala.minigame.bedwars.shared.shop

import gg.tropic.practice.currency.ShopCurrency
import org.bukkit.Material

/**
 * @author Limo
 * @date 2/13/2026
 */
enum class BedWarsAxeTier(
    val displayName: String,
    val material: Material,
    val purchaseCurrency: ShopCurrency,
    val purchaseCost: Int
)
{
    Wood(
        displayName = "Wooden Axe (Efficiency I)",
        material = Material.WOOD_AXE,
        purchaseCurrency = ShopCurrency.Iron,
        purchaseCost = 10
    ),
    Stone(
        displayName = "Stone Axe (Efficiency I)",
        material = Material.STONE_AXE,
        purchaseCurrency = ShopCurrency.Iron,
        purchaseCost = 10
    ),
    Iron(
        displayName = "Iron Axe (Efficiency II)",
        material = Material.IRON_AXE,
        purchaseCurrency = ShopCurrency.Gold,
        purchaseCost = 3
    ),
    Diamond(
        displayName = "Diamond Axe (Efficiency III)",
        material = Material.DIAMOND_AXE,
        purchaseCurrency = ShopCurrency.Gold,
        purchaseCost = 6
    );

    companion object
    {
        fun fromLevel(level: Int) = entries.getOrNull(level - 1)
        fun nextFrom(level: Int) = entries.getOrNull(level)
    }
}
