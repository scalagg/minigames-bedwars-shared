package gg.scala.minigame.bedwars.shared

import gg.tropic.practice.kit.feature.GameLifecycle
import gg.tropic.practice.minigame.MiniGameConfiguration

/**
 * @author Limo
 * @date 11/24/2025
 */
class BedWarsGameConfiguration(
    val mode: BedWarsMode,
    override val orchestratorID: String = "bedwars",
    override val lifecycleType: GameLifecycle = GameLifecycle.MiniGame,
    override val maximumPlayers: Int = mode.maxPlayers(),
    override val maximumPlayersPerTeam: Int = mode.teamSize,
    override val minimumPlayersRequiredToEnterStarting: Int = (mode.teamSize * 2).coerceAtLeast(2),
    override val minimumPlayersRequiredToFastForward: Int = (mode.teamSize * 2).coerceAtLeast(2),
    override val startGameCountDown: Int = 5,
    override val shouldBeAbleToReconnect: Boolean = true,
    override val reconnectThreshold: Long = 120000L,
    override val gameDescription: String = "BedWars Match",
) : MiniGameConfiguration
{
    override fun getAbstractType() = BedWarsGameConfiguration::class.java
}
