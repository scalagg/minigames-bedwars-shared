package gg.scala.minigame.bedwars.shared.shop

import gg.tropic.practice.currency.ShopCurrency
import org.bukkit.Material

/**
 * @author Limo
 * @date 2/13/2026
 */
object BedWarsShopCatalog
{
    const val QUICK_BUY_SLOT_COUNT = 21
    const val EMPTY_SLOT_ID = "__empty__"

    val entries = listOf(

        BedWarsShopEntry(
            id = "wool_16",
            displayName = "Wool",
            category = BedWarsShopCategory.Blocks,
            icon = Material.WOOL,
            currency = ShopCurrency.Iron,
            cost = 4,
            amount = 16
        ),
        BedWarsShopEntry(
            id = "clay_16",
            displayName = "Hardened Clay",
            category = BedWarsShopCategory.Blocks,
            icon = Material.STAINED_CLAY,
            currency = ShopCurrency.Iron,
            cost = 12,
            amount = 16
        ),
        BedWarsShopEntry(
            id = "glass_4",
            displayName = "Blast-Proof Glass",
            category = BedWarsShopCategory.Blocks,
            icon = Material.STAINED_GLASS,
            currency = ShopCurrency.Iron,
            cost = 12,
            amount = 4
        ),
        BedWarsShopEntry(
            id = "endstone_12",
            displayName = "End Stone",
            category = BedWarsShopCategory.Blocks,
            icon = Material.ENDER_STONE,
            currency = ShopCurrency.Iron,
            cost = 24,
            amount = 12
        ),
        BedWarsShopEntry(
            id = "ladder_16",
            displayName = "Ladder",
            category = BedWarsShopCategory.Blocks,
            icon = Material.LADDER,
            currency = ShopCurrency.Iron,
            cost = 4,
            amount = 8
        ),
        BedWarsShopEntry(
            id = "wood_16",
            displayName = "Oak Wood Planks",
            category = BedWarsShopCategory.Blocks,
            icon = Material.WOOD,
            currency = ShopCurrency.Gold,
            cost = 4,
            amount = 16,
            data = 0
        ),
        BedWarsShopEntry(
            id = "obsidian_4",
            displayName = "Obsidian",
            category = BedWarsShopCategory.Blocks,
            icon = Material.OBSIDIAN,
            currency = ShopCurrency.Emerald,
            cost = 4,
            amount = 4
        ),

        BedWarsShopEntry(
            id = "stone_sword",
            displayName = "Stone Sword",
            category = BedWarsShopCategory.Weapons,
            icon = Material.STONE_SWORD,
            currency = ShopCurrency.Iron,
            cost = 10
        ),
        BedWarsShopEntry(
            id = "iron_sword",
            displayName = "Iron Sword",
            category = BedWarsShopCategory.Weapons,
            icon = Material.IRON_SWORD,
            currency = ShopCurrency.Gold,
            cost = 7
        ),
        BedWarsShopEntry(
            id = "diamond_sword",
            displayName = "Diamond Sword",
            category = BedWarsShopCategory.Weapons,
            icon = Material.DIAMOND_SWORD,
            currency = ShopCurrency.Emerald,
            cost = 4
        ),
        BedWarsShopEntry(
            id = "kb_stick",
            displayName = "Stick (Knockback I)",
            category = BedWarsShopCategory.Weapons,
            icon = Material.STICK,
            currency = ShopCurrency.Gold,
            cost = 5,
            purchaseType = BedWarsShopPurchaseType.KnockbackStick
        ),

        BedWarsShopEntry(
            id = "chainmail_armor",
            displayName = "Permanent Chainmail Armor",
            category = BedWarsShopCategory.Armor,
            icon = Material.CHAINMAIL_BOOTS,
            currency = ShopCurrency.Iron,
            cost = 30,
            purchaseType = BedWarsShopPurchaseType.ArmorChainmail
        ),
        BedWarsShopEntry(
            id = "iron_armor",
            displayName = "Permanent Iron Armor",
            category = BedWarsShopCategory.Armor,
            icon = Material.IRON_BOOTS,
            currency = ShopCurrency.Gold,
            cost = 12,
            purchaseType = BedWarsShopPurchaseType.ArmorIron
        ),
        BedWarsShopEntry(
            id = "diamond_armor",
            displayName = "Permanent Diamond Armor",
            category = BedWarsShopCategory.Armor,
            icon = Material.DIAMOND_BOOTS,
            currency = ShopCurrency.Emerald,
            cost = 6,
            purchaseType = BedWarsShopPurchaseType.ArmorDiamond
        ),

        BedWarsShopEntry(
            id = "shears",
            displayName = "Permanent Shears",
            category = BedWarsShopCategory.Tools,
            icon = Material.SHEARS,
            currency = ShopCurrency.Iron,
            cost = 20,
            purchaseType = BedWarsShopPurchaseType.PermanentShears
        ),
        BedWarsShopEntry(
            id = "pickaxe",
            displayName = "Wooden Pickaxe (Efficiency I)",
            category = BedWarsShopCategory.Tools,
            icon = Material.WOOD_PICKAXE,
            currency = ShopCurrency.Iron,
            cost = 10,
            purchaseType = BedWarsShopPurchaseType.PermanentPickaxe
        ),
        BedWarsShopEntry(
            id = "axe",
            displayName = "Wooden Axe (Efficiency I)",
            category = BedWarsShopCategory.Tools,
            icon = Material.WOOD_AXE,
            currency = ShopCurrency.Iron,
            cost = 10,
            purchaseType = BedWarsShopPurchaseType.PermanentAxe
        ),

        BedWarsShopEntry(
            id = "arrows_8",
            displayName = "Arrow",
            category = BedWarsShopCategory.Ranged,
            icon = Material.ARROW,
            currency = ShopCurrency.Gold,
            cost = 2,
            amount = 6
        ),
        BedWarsShopEntry(
            id = "bow",
            displayName = "Bow",
            category = BedWarsShopCategory.Ranged,
            icon = Material.BOW,
            currency = ShopCurrency.Gold,
            cost = 12
        ),
        BedWarsShopEntry(
            id = "bow_power",
            displayName = "Bow (Power I)",
            category = BedWarsShopCategory.Ranged,
            icon = Material.BOW,
            currency = ShopCurrency.Gold,
            cost = 20,
            purchaseType = BedWarsShopPurchaseType.BowPower
        ),
        BedWarsShopEntry(
            id = "bow_punch",
            displayName = "Bow (Power I, Punch I)",
            category = BedWarsShopCategory.Ranged,
            icon = Material.BOW,
            currency = ShopCurrency.Emerald,
            cost = 6,
            purchaseType = BedWarsShopPurchaseType.BowPunch
        ),

        BedWarsShopEntry(
            id = "speed_potion",
            displayName = "Speed II Potion (45 seconds)",
            category = BedWarsShopCategory.Potions,
            icon = Material.POTION,
            currency = ShopCurrency.Emerald,
            cost = 1,
            purchaseType = BedWarsShopPurchaseType.SpeedPotion
        ),
        BedWarsShopEntry(
            id = "jump_potion",
            displayName = "Jump V Potion (45 seconds)",
            category = BedWarsShopCategory.Potions,
            icon = Material.POTION,
            currency = ShopCurrency.Emerald,
            cost = 1,
            purchaseType = BedWarsShopPurchaseType.JumpPotion
        ),
        BedWarsShopEntry(
            id = "invis_potion",
            displayName = "Invisibility Potion (30 seconds)",
            category = BedWarsShopCategory.Potions,
            icon = Material.POTION,
            currency = ShopCurrency.Emerald,
            cost = 2,
            purchaseType = BedWarsShopPurchaseType.InvisibilityPotion
        ),

        BedWarsShopEntry(
            id = "gapple",
            displayName = "Golden Apple",
            category = BedWarsShopCategory.Utility,
            icon = Material.GOLDEN_APPLE,
            currency = ShopCurrency.Gold,
            cost = 3
        ),
        BedWarsShopEntry(
            id = "fireball",
            displayName = "Fireball",
            category = BedWarsShopCategory.Utility,
            icon = Material.FIREBALL,
            currency = ShopCurrency.Iron,
            cost = 40
        ),
        BedWarsShopEntry(
            id = "tnt",
            displayName = "TNT",
            category = BedWarsShopCategory.Utility,
            icon = Material.TNT,
            currency = ShopCurrency.Gold,
            cost = 4
        ),
        BedWarsShopEntry(
            id = "ender_pearl",
            displayName = "Ender Pearl",
            category = BedWarsShopCategory.Utility,
            icon = Material.ENDER_PEARL,
            currency = ShopCurrency.Emerald,
            cost = 4
        ),
        BedWarsShopEntry(
            id = "water_bucket",
            displayName = "Water Bucket",
            category = BedWarsShopCategory.Utility,
            icon = Material.WATER_BUCKET,
            currency = ShopCurrency.Gold,
            cost = 3,
            purchaseType = BedWarsShopPurchaseType.WaterBucket
        ),
        BedWarsShopEntry(
            id = "bridge_egg",
            displayName = "Bridge Egg",
            category = BedWarsShopCategory.Utility,
            icon = Material.EGG,
            currency = ShopCurrency.Emerald,
            cost = 1,
            purchaseType = BedWarsShopPurchaseType.BridgeEgg
        ),
        BedWarsShopEntry(
            id = "magic_milk",
            displayName = "Magic Milk",
            category = BedWarsShopCategory.Utility,
            icon = Material.MILK_BUCKET,
            currency = ShopCurrency.Gold,
            cost = 4,
            purchaseType = BedWarsShopPurchaseType.MagicMilk
        ),
        BedWarsShopEntry(
            id = "sponge_4",
            displayName = "Sponge",
            category = BedWarsShopCategory.Utility,
            icon = Material.SPONGE,
            currency = ShopCurrency.Gold,
            cost = 3,
            amount = 4,
            purchaseType = BedWarsShopPurchaseType.Sponge
        ),
        BedWarsShopEntry(
            id = "compact_pop",
            displayName = "Compact Pop-up Tower",
            category = BedWarsShopCategory.Utility,
            icon = Material.TRAPPED_CHEST,
            currency = ShopCurrency.Iron,
            cost = 24,
            purchaseType = BedWarsShopPurchaseType.CompactPop
        ),
        BedWarsShopEntry(
            id = "dream_defender",
            displayName = "Dream Defender",
            category = BedWarsShopCategory.Utility,
            icon = Material.MONSTER_EGG,
            currency = ShopCurrency.Iron,
            cost = 120,
            purchaseType = BedWarsShopPurchaseType.DreamDefender
        ),
        BedWarsShopEntry(
            id = "bedbug",
            displayName = "Bedbug",
            category = BedWarsShopCategory.Utility,
            icon = Material.SNOW_BALL,
            currency = ShopCurrency.Iron,
            cost = 30,
            purchaseType = BedWarsShopPurchaseType.Bedbug
        )
    )

    val byId = entries.associateBy(BedWarsShopEntry::id)

    val defaultQuickBuyLayout = listOf(
        "wool_16", "stone_sword", "chainmail_armor", "pickaxe", "bow", "speed_potion", "tnt",
        "wood_16", "iron_sword", "iron_armor", "shears", "arrows_8", "invis_potion", "water_bucket",
        "gapple", "jump_potion", "glass_4", "endstone_12", "axe", "bow_power", "bow_punch"
    ).map {
        if (it == "EMPTY") EMPTY_SLOT_ID else it
    }

    fun categoryEntries(category: BedWarsShopCategory) = entries
        .filter { entry -> entry.category == category }

    fun quickBuyEntries() = entries
        .filter(BedWarsShopEntry::quickBuyEligible)

    fun normalizeQuickBuyLayout(stored: Collection<String>?): MutableList<String>
    {
        if (stored.isNullOrEmpty())
        {
            return defaultQuickBuyLayout
                .take(QUICK_BUY_SLOT_COUNT)
                .toMutableList()
        }

        val normalized = stored
            .take(QUICK_BUY_SLOT_COUNT)
            .map { id ->
                if (id == EMPTY_SLOT_ID)
                {
                    EMPTY_SLOT_ID
                } else
                {
                    byId[id]?.id ?: EMPTY_SLOT_ID
                }
            }
            .toMutableList()

        while (normalized.size < QUICK_BUY_SLOT_COUNT)
        {
            normalized += EMPTY_SLOT_ID
        }

        return normalized
    }
}
