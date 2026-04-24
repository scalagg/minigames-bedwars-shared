package gg.scala.minigame.bedwars.shared.rotation

import gg.tropic.practice.currency.ShopCurrency
import org.bukkit.Material

/**
 * @author Limo
 * @date 2/18/2026
 */
enum class RotationalItemDefinition(
    val displayName: String,
    val description: List<String>,
    val icon: Material,
    val iconData: Short = 0,
    val currency: ShopCurrency,
    val cost: Int,
    val amount: Int = 1
)
{
    Sugarkin(
        displayName = "Sugarkin",
        description = listOf(
            "A ninja's best friend! Right",
            "Click to throw."
        ),
        icon = Material.NETHER_STAR,
        currency = ShopCurrency.Iron,
        cost = 20
    ),
    IceBridge(
        displayName = "Ice Bridge",
        description = listOf(
            "Spawns a bridge of ice blocks,",
            "in front of you."
        ),
        icon = Material.ICE,
        currency = ShopCurrency.Gold,
        cost = 5
    ),
    SugarCookie(
        displayName = "Super Cookie",
        description = listOf(
            "Gain Speed III and Jump IV for",
            "15 seconds!"
        ),
        icon = Material.COOKIE,
        currency = ShopCurrency.Emerald,
        cost = 1
    ),
    FestivityMine(
        displayName = "Festivity Mine",
        description = listOf(
            "Spawns a mine that will blast,",
            "if enemy player walks on it."
        ),
        icon = Material.CARPET,
        currency = ShopCurrency.Gold,
        cost = 10
    ),
    ChickenTurret(
        displayName = "Chicken Turret",
        description = listOf(
            "Deploys chickens that peck",
            "enemies for minor damage",
            "over time."
        ),
        icon = Material.MONSTER_EGG,
        iconData = 93,
        currency = ShopCurrency.Iron,
        cost = 48
    ),
    PortableShopkeeper(
        displayName = "Portable Shopkeeper",
        description = listOf(
            "Place a temporary shop that",
            "vanishes after 10 seconds."
        ),
        icon = Material.CHEST,
        currency = ShopCurrency.Gold,
        cost = 5
    ),
    ThrowableTNT(
        displayName = "Throwable TNT",
        description = listOf(
            "A lobbed explosive that",
            "detonates on impact."
        ),
        icon = Material.TNT,
        currency = ShopCurrency.Gold,
        cost = 5
    ),
    MiracleOfTheStars(
        displayName = "Miracle of the Stars",
        description = listOf(
            "A star-themed utility that",
            "heals you and nearby teammates."
        ),
        icon = Material.NETHER_STAR,
        currency = ShopCurrency.Emerald,
        cost = 3
    ),
    TimeWarpPearl(
        displayName = "Time Warp Pearl",
        description = listOf(
            "Throw to teleport forward, then",
            "warp back after 3 seconds."
        ),
        icon = Material.ENDER_PEARL,
        currency = ShopCurrency.Emerald,
        cost = 3
    ),
    FinalReviveBeacon(
        displayName = "Final Revive Beacon",
        description = listOf(
            "A last-chance revive tool for",
            "downed teammates."
        ),
        icon = Material.BEACON,
        currency = ShopCurrency.Emerald,
        cost = 6
    ),
    MegaTNT(
        displayName = "Mega TNT",
        description = listOf(
            "An explosive with a larger",
            "blast radius."
        ),
        icon = Material.TNT,
        currency = ShopCurrency.Gold,
        cost = 8
    ),
    PackedIce(
        displayName = "Packed Ice",
        description = listOf(
            "Slippery block for traps",
            "or speed bridging."
        ),
        icon = Material.PACKED_ICE,
        currency = ShopCurrency.Iron,
        cost = 16,
        amount = 4
    ),
    HayBale(
        displayName = "Hay Bale",
        description = listOf(
            "Cheap defensive block that",
            "breaks easily."
        ),
        icon = Material.HAY_BLOCK,
        currency = ShopCurrency.Iron,
        cost = 4,
        amount = 4
    ),
    UnstableTeleportationDevice(
        displayName = "Unstable TP Device",
        description = listOf(
            "Teleport to a random location.",
            "High risk, high reward."
        ),
        icon = Material.EYE_OF_ENDER,
        currency = ShopCurrency.Gold,
        cost = 7
    ),
    Sharpness2(
        displayName = "Sharpness II",
        description = listOf(
            "Upgrade your sword with",
            "Sharpness II."
        ),
        icon = Material.ENCHANTED_BOOK,
        currency = ShopCurrency.Emerald,
        cost = 4
    ),
    BridgeZapper(
        displayName = "Bridge Zapper",
        description = listOf(
            "Clicking on wool will instantly zap",
            "up to 8 adjacent wool blocks!"
        ),
        icon = Material.SHEARS,
        currency = ShopCurrency.Iron,
        cost = 32
    ),
    FeatherFalling(
        displayName = "Feather Falling",
        description = listOf(
            "Enchant your boots to reduce",
            "fall damage entirely."
        ),
        icon = Material.ENCHANTED_BOOK,
        currency = ShopCurrency.Emerald,
        cost = 4
    ),
    LuckyChest(
        displayName = "Lucky Chest",
        description = listOf(
            "Place a chest with random loot.",
            "Could be amazing or useless."
        ),
        icon = Material.ENDER_CHEST,
        currency = ShopCurrency.Gold,
        cost = 6
    ),
    ShearUpgrades(
        displayName = "Shear Upgrades",
        description = listOf(
            "Enhanced shears for faster",
            "wool and obsidian cutting."
        ),
        icon = Material.SHEARS,
        currency = ShopCurrency.Gold,
        cost = 5
    ),
    BlackHole(
        displayName = "Black Hole",
        description = listOf(
            "Pulls nearby players inward",
            "inescapably. Top-tier",
            "crowd control."
        ),
        icon = Material.ENDER_PORTAL_FRAME,
        currency = ShopCurrency.Emerald,
        cost = 6
    ),
    BlockShuffler(
        displayName = "Block Shuffler",
        description = listOf(
            "Summons an Enderman to",
            "rearrange nearby blocks."
        ),
        icon = Material.MONSTER_EGG,
        iconData = 58,
        currency = ShopCurrency.Gold,
        cost = 7
    ),
    CharlieTheUnicorn(
        displayName = "Charlie the Unicorn",
        description = listOf(
            "Spawn a unicorn that will",
            "fly for 10 seconds."
        ),
        icon = Material.WHEAT,
        currency = ShopCurrency.Emerald,
        cost = 1
    ),
    DevastatorBow(
        displayName = "Devastator Bow",
        description = listOf(
            "A high-damage bow with",
            "Power III."
        ),
        icon = Material.BOW,
        currency = ShopCurrency.Emerald,
        cost = 2
    ),
    IllusionTrap(
        displayName = "Illusion Trap",
        description = listOf(
            "Creates fake blocks to",
            "deceive and trap enemies."
        ),
        icon = Material.TRIPWIRE_HOOK,
        currency = ShopCurrency.Gold,
        cost = 5
    ),
    Snowman(
        displayName = "Snowman",
        description = listOf(
            "Summons a snowman that fires",
            "ranged snowballs at enemies."
        ),
        icon = Material.PUMPKIN,
        currency = ShopCurrency.Gold,
        cost = 6
    ),
    Cobwebs(
        displayName = "Cobwebs",
        description = listOf(
            "Deployable webs to slow",
            "down enemies."
        ),
        icon = Material.WEB,
        currency = ShopCurrency.Iron,
        cost = 16,
        amount = 4
    ),
    BlockZapper(
        displayName = "Block Zapper",
        description = listOf(
            "Destroys up to 16 blocks",
            "of any type in a line."
        ),
        icon = Material.BLAZE_ROD,
        currency = ShopCurrency.Gold,
        cost = 7
    );

    val id: String
        get() = name.lowercase()
}
