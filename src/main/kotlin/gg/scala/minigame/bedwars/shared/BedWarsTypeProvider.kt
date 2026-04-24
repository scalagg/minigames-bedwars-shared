package gg.scala.minigame.bedwars.shared

import com.cryptomorin.xseries.XMaterial
import gg.tropic.practice.minigame.MiniGameModeMetadata
import gg.tropic.practice.minigame.MiniGameTypeMetadata
import gg.tropic.practice.minigame.MiniGameTypeProvider
import gg.tropic.practice.queue.QueueType

/**
 * @author Limo
 * @date 2/13/2026
 */
object BedWarsTypeProvider : MiniGameTypeProvider
{
    private val queueType = QueueType.Casual
    private val fallbackDisplayItem = XMaterial.RED_BED.parseItem()
        ?: XMaterial.BRICK.parseItem()!!

    private fun queueIdFor(kitId: String, teamSize: Int) = "$kitId:$queueType:${teamSize}v$teamSize"

    private fun displayItem(material: XMaterial) = material.parseItem()
        ?: fallbackDisplayItem

    override fun provide(): MiniGameTypeMetadata = configuration

    val configuration = MiniGameTypeMetadata(
        internalId = "bedwars",
        displayName = "Bed Wars",
        item = XMaterial.RED_BED,
        lobbyGroup = "bedwars",
        gameModes = linkedMapOf(
            "solo" to MiniGameModeMetadata(
                id = "solo",
                description = "Every player fights for their own bed.",
                queueId = queueIdFor("bw_mini_solo", BedWarsMode.SOLO.teamSize),
                displayName = "Solo",
                displayItem = displayItem(XMaterial.RED_BED),
                mapGroup = "bedwars",
                kitID = "bw_mini_solo",
                mode = BedWarsMode.SOLO,
                npcSkinValue = "",
                npcSkinSignature = "",
                allowMapSelection = true,
                allowRejoins = true
            ),
            "doubles" to MiniGameModeMetadata(
                id = "doubles",
                description = "Classic two player team Bed Wars.",
                queueId = queueIdFor("bw_mini_duos", BedWarsMode.DOUBLES.teamSize),
                displayName = "Doubles",
                displayItem = displayItem(XMaterial.YELLOW_BED),
                mapGroup = "bedwars",
                kitID = "bw_mini_duos",
                mode = BedWarsMode.DOUBLES,
                npcSkinValue = "",
                npcSkinSignature = "",
                allowMapSelection = true,
                allowRejoins = true
            ),
            "trios" to MiniGameModeMetadata(
                id = "trios",
                description = "Three players per team for balanced fights.",
                queueId = queueIdFor("bw_mega_trios", BedWarsMode.TRIOS.teamSize),
                displayName = "3v3v3v3",
                displayItem = displayItem(XMaterial.LIME_BED),
                mapGroup = "bedwars",
                kitID = "bw_mega_trios",
                mode = BedWarsMode.TRIOS,
                npcSkinValue = "",
                npcSkinSignature = "",
                allowMapSelection = true,
                allowRejoins = true
            ),
            "4v4" to MiniGameModeMetadata(
                id = "4v4",
                description = "Four players per team in head-to-head BedWars.",
                queueId = queueIdFor("bw_4v4", BedWarsMode.FOURS.teamSize),
                displayName = "4v4",
                displayItem = displayItem(XMaterial.BLUE_BED),
                mapGroup = "bedwars",
                kitID = "bw_4v4",
                mode = BedWarsMode.FOURS,
                npcSkinValue = "",
                npcSkinSignature = "",
                allowMapSelection = true,
                allowRejoins = true
            ),
            "quads" to MiniGameModeMetadata(
                id = "quads",
                description = "Four players per team with four teams battling.",
                queueId = queueIdFor("bw_mega_quads", BedWarsMode.QUADS.teamSize),
                displayName = "4v4v4v4",
                displayItem = displayItem(XMaterial.PURPLE_BED),
                mapGroup = "bedwars",
                kitID = "bw_mega_quads",
                mode = BedWarsMode.QUADS,
                npcSkinValue = "",
                npcSkinSignature = "",
                allowMapSelection = true,
                allowRejoins = true
            )
        ),
        autoJoinSkinValue = "",
        autoJoinSkinSignature = ""
    )
}
