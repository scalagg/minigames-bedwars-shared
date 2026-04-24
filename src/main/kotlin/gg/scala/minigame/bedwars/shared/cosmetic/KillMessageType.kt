package gg.scala.minigame.bedwars.shared.cosmetic

import org.bukkit.Material

/**
 * @author Limo
 * @date 2/20/2026
 */
object KillMessageType
{

    const val PVP_KILL = "PvP-Kill"
    const val VOID_KILL = "Void-Kill"
    const val EXPLOSION_KILL = "Explosion-Kill"
    const val SHOOT_KILL = "Shoot-Kill"

    data class KillMessageEntry(
        val cosmetic: CosmeticEntry,
        val messages: Map<String, List<String>>
    )

    private val killMessages: List<KillMessageEntry> = listOf(
        KillMessageEntry(
            cosmetic = CosmeticEntry(
                id = "default",
                displayName = "Default",
                description = listOf("\u00a77Use the default kill message."),
                material = Material.BARRIER,
                rarity = CosmeticRarity.NONE
            ),
            messages = emptyMap()
        ),
        KillMessageEntry(
            cosmetic = CosmeticEntry(
                id = "fire",
                displayName = "Fire",
                description = listOf(
                    "\u00a77Fiery kill messages that",
                    "\u00a77burn your enemies!"
                ),
                material = Material.BLAZE_POWDER,
                rarity = CosmeticRarity.COMMON
            ),
            messages = mapOf(
                PVP_KILL to listOf(
                    "{victim} \u00a77was struck down by {killer}.",
                    "{victim} \u00a77was turned to dust by {killer}.",
                    "{victim} \u00a77was melted by {killer}.",
                    "{victim} \u00a77was turned to ash by {killer}.",
                    "{victim} \u00a77was fried by {killer}."
                )
            )
        ),
        KillMessageEntry(
            cosmetic = CosmeticEntry(
                id = "western",
                displayName = "Western",
                description = listOf(
                    "\u00a77Howdy partner! Western",
                    "\u00a77themed kill messages."
                ),
                material = Material.BOW,
                rarity = CosmeticRarity.COMMON
            ),
            messages = mapOf(
                PVP_KILL to listOf(
                    "{victim} \u00a77was filled full of lead by {killer}.",
                    "{victim} \u00a77met their end by {killer}.",
                    "{victim} \u00a77lost a drinking contest with {killer}."
                ),
                EXPLOSION_KILL to listOf(
                    "{victim} \u00a77was killed with dynamite by {killer}."
                )
            )
        ),
        KillMessageEntry(
            cosmetic = CosmeticEntry(
                id = "honourable",
                displayName = "Honourable",
                description = listOf(
                    "\u00a77Fight with honor!",
                    "\u00a77Honourable kill messages."
                ),
                material = Material.DIAMOND,
                rarity = CosmeticRarity.COMMON
            ),
            messages = mapOf(
                PVP_KILL to listOf(
                    "{victim} \u00a77died in close combat to {killer}."
                ),
                VOID_KILL to listOf(
                    "{victim} \u00a77fought to the edge with {killer}.",
                    "{victim} \u00a77fell to the great marksmanship of {killer}.",
                    "{victim} \u00a77stumbled off a ledge with help by {killer}."
                )
            )
        ),
        KillMessageEntry(
            cosmetic = CosmeticEntry(
                id = "love",
                displayName = "Love",
                description = listOf(
                    "\u00a77Spread the love with",
                    "\u00a77romantic kill messages!"
                ),
                material = Material.SKULL_ITEM,
                materialData = 3,
                rarity = CosmeticRarity.COMMON,
                skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTI5ZmI5ZjU5M2I2YWU1MzNkZmE4Y2U3OTYxNWZjYzM1ODk0YTQyY2JiNDFkZTU5OGQ2OTQ3NjczNTJmZSJ9fX0="
            ),
            messages = mapOf(
                PVP_KILL to listOf(
                    "{victim} \u00a77was given the cold shoulder by {killer}.",
                    "{victim} \u00a77was out of the league of {killer}."
                ),
                EXPLOSION_KILL to listOf(
                    "{victim} \u00a77was hit off by a love bomb from {killer}."
                ),
                SHOOT_KILL to listOf(
                    "{victim} \u00a77was struck with Cupid's arrow by {killer}."
                )
            )
        ),
        KillMessageEntry(
            cosmetic = CosmeticEntry(
                id = "bbq",
                displayName = "BBQ",
                description = listOf(
                    "\u00a77Grill your enemies with",
                    "\u00a77BBQ themed kill messages!"
                ),
                material = Material.SKULL_ITEM,
                materialData = 3,
                rarity = CosmeticRarity.COMMON,
                skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTg2ZjE5YmYyM2QyNDhlNjYyYzljOGI3ZmExNWVmYjhhMWYxZDViZGFjZDNiODYyNWE5YjU5ZTkzYWM4YSJ9fX0="
            ),
            messages = mapOf(
                PVP_KILL to listOf(
                    "{victim} \u00a77was glazed in BBQ sauce by {killer}.",
                    "{victim} \u00a77was not spicy enough for {killer}."
                ),
                VOID_KILL to listOf(
                    "{victim} \u00a77slipped in BBQ sauce off the edge spilled by {killer}.",
                    "{victim} \u00a77was thrown chilli powder at by {killer}."
                )
            )
        ),
        KillMessageEntry(
            cosmetic = CosmeticEntry(
                id = "woof-woof",
                displayName = "Woof Woof",
                description = listOf(
                    "\u00a77Bark at your enemies with",
                    "\u00a77doggy kill messages!"
                ),
                material = Material.BONE,
                rarity = CosmeticRarity.COMMON
            ),
            messages = mapOf(
                PVP_KILL to listOf(
                    "{victim} \u00a77was bitten by {killer}.",
                    "{victim} \u00a77was distracted by a puppy place by {killer}.",
                    "{victim} \u00a77played too rough with {killer}.",
                    "{victim} \u00a77was ripped apart by {killer}."
                ),
                VOID_KILL to listOf(
                    "{victim} \u00a77howled into the void for {killer}.",
                    "{victim} \u00a77was bitten by {killer}."
                )
            )
        ),
        KillMessageEntry(
            cosmetic = CosmeticEntry(
                id = "santas-workshop",
                displayName = "Santa's Workshop",
                description = listOf(
                    "\u00a77Ho ho ho! Christmas themed",
                    "\u00a77kill messages!"
                ),
                material = Material.SNOW_BALL,
                rarity = CosmeticRarity.COMMON
            ),
            messages = mapOf(
                PVP_KILL to listOf(
                    "{victim} \u00a77was wrapped into a gift by {killer}.",
                    "{victim} \u00a77was put on the naughty list by {killer}.",
                    "{victim} \u00a77was turned to gingerbread by {killer}."
                ),
                VOID_KILL to listOf(
                    "{victim} \u00a77was pushed down a slope by {killer}."
                )
            )
        ),
        KillMessageEntry(
            cosmetic = CosmeticEntry(
                id = "primal",
                displayName = "Primal",
                description = listOf(
                    "\u00a77Hunt your enemies with",
                    "\u00a77primal kill messages!"
                ),
                material = Material.STONE_AXE,
                rarity = CosmeticRarity.COMMON
            ),
            messages = mapOf(
                PVP_KILL to listOf(
                    "{victim} \u00a77was hunted down by {killer}.",
                    "{victim} \u00a77stumbled on a trap set by {killer}.",
                    "{victim} \u00a77was mauled by {killer}."
                ),
                VOID_KILL to listOf(
                    "{victim} \u00a77was thrown into volcano by {killer}."
                )
            )
        ),
        KillMessageEntry(
            cosmetic = CosmeticEntry(
                id = "squeak",
                displayName = "Squeak",
                description = listOf(
                    "\u00a77Squeak! Mouse themed",
                    "\u00a77kill messages!"
                ),
                material = Material.SKULL_ITEM,
                materialData = 3,
                rarity = CosmeticRarity.COMMON,
                skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGI2ZDI0ODQ5ZmY4ODZiMWQ0ZjI0ZjVhMTg2NWNlMzhmNmE0NzFmMzAwYzU3MTcxYWFhMDRhYWQ0YWM5YWNiZiJ9fX0="
            ),
            messages = mapOf(
                PVP_KILL to listOf(
                    "{victim} \u00a77was chewed up by {killer}.",
                    "{victim} \u00a77stepped in a mouse trap placed by {killer}.",
                    "{victim} \u00a77was distracted by a rat dragging pizza from {killer}."
                ),
                VOID_KILL to listOf(
                    "{victim} \u00a77was scared into the void by {killer}."
                )
            )
        ),
        KillMessageEntry(
            cosmetic = CosmeticEntry(
                id = "pirate",
                displayName = "Pirate",
                description = listOf(
                    "\u00a77Arr! Pirate themed",
                    "\u00a77kill messages!"
                ),
                material = Material.SKULL_ITEM,
                materialData = 3,
                rarity = CosmeticRarity.RARE,
                skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWFhMmY1OTQ5NzgwN2FkMDVjYWYwYmZmMjQ4YTAzYmNhZTU0YmJhMmY2YWVhMzY5ZGNhYmMwZjUwOGE4OWIzIn19fQ=="
            ),
            messages = mapOf(
                PVP_KILL to listOf(
                    "{victim} \u00a77be sent to Davy Jone's locker by {killer}.",
                    "{victim} \u00a77be cannonballed to death by {killer}.",
                    "{victim} \u00a77be killed with magic by {killer}.",
                    "{victim} \u00a77be killed with metal by {killer}."
                ),
                EXPLOSION_KILL to listOf(
                    "{victim} \u00a77be shot with cannon by {killer}."
                )
            )
        ),
        KillMessageEntry(
            cosmetic = CosmeticEntry(
                id = "spooked",
                displayName = "Spooked",
                description = listOf(
                    "\u00a77Spooky! Halloween themed",
                    "\u00a77kill messages!"
                ),
                material = Material.JACK_O_LANTERN,
                rarity = CosmeticRarity.RARE
            ),
            messages = mapOf(
                PVP_KILL to listOf(
                    "{victim} \u00a77was spooked by {killer}.",
                    "{victim} \u00a77was remotely spooked by {killer}.",
                    "{victim} \u00a77was totally spooked by {killer}."
                ),
                VOID_KILL to listOf(
                    "{victim} \u00a77was spooked off the map by {killer}."
                )
            )
        ),
        KillMessageEntry(
            cosmetic = CosmeticEntry(
                id = "memed",
                displayName = "Memed",
                description = listOf(
                    "\u00a77Get memed on! Meme themed",
                    "\u00a77kill messages!"
                ),
                material = Material.SKULL_ITEM,
                materialData = 3,
                rarity = CosmeticRarity.RARE,
                skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjIyYjMzMTliNTk5MzQ4MTcyMzAzNThjZjMzZDAzOGM5ODNjOWI2NzdhZDE1YjBhM2Y1ZjFmZTNiNWMxNTdiIn19fQ=="
            ),
            messages = mapOf(
                PVP_KILL to listOf(
                    "{victim} \u00a77got rekt by {killer}.",
                    "{victim} \u00a77took the L to {killer}.",
                    "{victim} \u00a77got smacked by {killer}.",
                    "{victim} \u00a77got roasted by {killer}.",
                    "{victim} \u00a77got bamboozled by {killer}."
                ),
                VOID_KILL to listOf(
                    "{victim} \u00a77was smacked and fell into the void by {killer}."
                )
            )
        ),
        KillMessageEntry(
            cosmetic = CosmeticEntry(
                id = "buzz",
                displayName = "Buzz",
                description = listOf(
                    "\u00a77Buzz! Bee themed",
                    "\u00a77kill messages!"
                ),
                material = Material.SKULL_ITEM,
                materialData = 3,
                rarity = CosmeticRarity.RARE,
                skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjU5MDAxYTg1MWJiMWI5ZTljMDVkZTVkNWM2OGIxZWEwZGM4YmQ4NmJhYmYxODhlMGFkZWQ4ZjkxMmMwN2QwZCJ9fX0="
            ),
            messages = mapOf(
                PVP_KILL to listOf(
                    "{victim} \u00a77was buzzed to death by {killer}.",
                    "{victim} \u00a77was startled by {killer}.",
                    "{victim} \u00a77was bee'd by {killer}."
                ),
                VOID_KILL to listOf(
                    "{victim} \u00a77was stung off the edge by {killer}.",
                    "{victim} \u00a77was buzzz'd into the void by {killer}."
                )
            )
        ),
        KillMessageEntry(
            cosmetic = CosmeticEntry(
                id = "dramatic",
                displayName = "Dramatic",
                description = listOf(
                    "\u00a77How dramatic! Theatrical",
                    "\u00a77kill messages!"
                ),
                material = Material.SKULL_ITEM,
                materialData = 3,
                rarity = CosmeticRarity.RARE,
                skullTexture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzY5ZWM3MjJkOWNiNmVkOWJhZTkzYzI2NmJkMDk4ZjBhMzA2YzVlOGMwMzg0OWMyN2NkY2YxOGM2MGQ2Y2IzZSJ9fX0="
            ),
            messages = mapOf(
                PVP_KILL to listOf(
                    "{victim} \u00a77was tragically backstabbed by {killer}.",
                    "{victim} \u00a77heart was pierced by {killer}.",
                    "{victim} \u00a77was delivered into nothingness by {killer}.",
                    "{victim} \u00a77was dismembered by {killer}.",
                    "{victim} \u00a77was dreadfully corrupted by {killer}."
                ),
                VOID_KILL to listOf(
                    "{victim} \u00a77was heatlessly let go by {killer}."
                )
            )
        ),
        KillMessageEntry(
            cosmetic = CosmeticEntry(
                id = "oink",
                displayName = "Oink",
                description = listOf(
                    "\u00a77Oink! Pig themed",
                    "\u00a77kill messages!"
                ),
                material = Material.COOKED_BEEF,
                rarity = CosmeticRarity.RARE
            ),
            messages = mapOf(
                PVP_KILL to listOf(
                    "{victim} \u00a77was oinked by {killer}.",
                    "{victim} \u00a77got attacked by a carrot from {killer}.",
                    "{victim} \u00a77was distracted by a piglet from {killer}."
                ),
                VOID_KILL to listOf(
                    "{victim} \u00a77slipped into void for {killer}."
                )
            )
        )
    )

    fun entries(): List<CosmeticEntry> = killMessages.map { it.cosmetic }

    fun find(id: String) = entries().firstOrNull { it.id == id }

    fun findMessageEntry(id: String) = killMessages.firstOrNull { it.cosmetic.id == id }

    fun formatKillMessage(
        killMessageId: String,
        killerName: String,
        victimName: String,
        killerColor: String,
        victimColor: String,
        killType: String = PVP_KILL
    ): String?
    {
        val entry = findMessageEntry(killMessageId) ?: return null
        val typeMessages = entry.messages[killType]
            ?: entry.messages[PVP_KILL]
            ?: return null

        if (typeMessages.isEmpty()) return null

        val template = typeMessages.random()
        return template
            .replace("{killer}", "$killerColor$killerName")
            .replace("{victim}", "$victimColor$victimName")
    }
}
