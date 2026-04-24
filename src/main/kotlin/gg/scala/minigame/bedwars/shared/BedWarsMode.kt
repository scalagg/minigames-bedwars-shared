package gg.scala.minigame.bedwars.shared

import gg.tropic.practice.minigame.MiniGameMode
import gg.tropic.practice.provider.MiniProviderVersion
import gg.tropic.practice.queue.QueueType

/**
 * @author Limo
 * @date 11/20/2025
 */
enum class BedWarsMode(
    val queueType: QueueType,
    val providerVersion: MiniProviderVersion
) : MiniGameMode
{
    FOURS(QueueType.Casual, MiniProviderVersion.LEGACY)
    {
        override val teamSize: Int = 4
        override val teamCount: Int = 2
        override fun maxPlayers(): Int = 8
    },
    QUADS(QueueType.Casual, MiniProviderVersion.LEGACY)
    {
        override val teamSize: Int = 4
        override val teamCount: Int = 4
        override fun maxPlayers(): Int = 16
    },
    TRIOS(QueueType.Casual, MiniProviderVersion.LEGACY)
    {
        override val teamSize: Int = 3
        override val teamCount: Int = 4
        override fun maxPlayers(): Int = 12
    },
    DOUBLES(QueueType.Casual, MiniProviderVersion.LEGACY)
    {
        override val teamSize: Int = 2
        override val teamCount: Int = 8
        override fun maxPlayers(): Int = 16
    },
    SOLO(QueueType.Casual, MiniProviderVersion.LEGACY)
    {
        override val teamSize: Int = 1
        override val teamCount: Int = 8
        override fun maxPlayers(): Int = 8
    }
}
