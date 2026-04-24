package gg.scala.minigame.bedwars.shared.shop

import org.bukkit.Material

/**
 * @author Limo
 * @date 2/13/2026
 */
enum class BedWarsShopCategory(
    val displayName: String,
    val icon: Material
)
{
    QuickBuy("Quick Buy", Material.NETHER_STAR),
    Blocks("Blocks", Material.STAINED_CLAY),
    Weapons("Melee", Material.GOLD_SWORD),
    Armor("Armor", Material.CHAINMAIL_BOOTS),
    Tools("Tools", Material.STONE_PICKAXE),
    Ranged("Ranged", Material.BOW),
    Potions("Potions", Material.BREWING_STAND_ITEM),
    Utility("Utility", Material.TNT),
    Rotational("Rotating Items", Material.REDSTONE_TORCH_ON)
}
