package gg.scala.minigame.bedwars.shared.profile

import gg.scala.minigame.bedwars.shared.BedWarsMode
import gg.scala.minigame.bedwars.shared.BedWarsTypeProvider
import gg.tropic.practice.profile.PracticeProfile
import gg.tropic.practice.statistics.TrackedKitStatistic
import gg.tropic.practice.statistics.statisticIdFrom

/**
 * @author Limo
 * @date 2/13/2026
 */
data class BedWarsModeProfileStatistics(
    val mode: BedWarsMode,
    val plays: Long,
    val wins: Long,
    val losses: Long,
    val kills: Long,
    val deaths: Long,
    val bedsBroken: Long,
    val finalKills: Long,
    val finalDeaths: Long
)
{
    val kdRatio = if (deaths <= 0L) kills.toDouble() else kills.toDouble() / deaths.toDouble()
    val fkdr = if (finalDeaths <= 0L) finalKills.toDouble() else finalKills.toDouble() / finalDeaths.toDouble()
    val winRate = if (plays <= 0L) 0.0 else (wins.toDouble() / plays.toDouble()) * 100.0
}

/**
 * @author Limo
 * @date 2/13/2026
 */
data class BedWarsProfileStatistics(
    val plays: Long,
    val wins: Long,
    val losses: Long,
    val kills: Long,
    val deaths: Long,
    val bedBreaks: Long,
    val finalKills: Long,
    val finalDeaths: Long,
    val winStreak: Long,
    val highestWinStreak: Long,
    val modeStatistics: Map<BedWarsMode, BedWarsModeProfileStatistics>
)
{
    val kdRatio = if (deaths <= 0L) kills.toDouble() else kills.toDouble() / deaths.toDouble()
    val fkdr = if (finalDeaths <= 0L) finalKills.toDouble() else finalKills.toDouble() / finalDeaths.toDouble()
    val winRate = if (plays <= 0L) 0.0 else (wins.toDouble() / plays.toDouble()) * 100.0
}

/**
 * @author Limo
 * @date 2/13/2026
 */
object BedWarsProfileStatisticsService
{
    private const val overallKit = "bedwars"

    private val coreModes = listOf(
        BedWarsMode.SOLO,
        BedWarsMode.DOUBLES,
        BedWarsMode.TRIOS,
        BedWarsMode.QUADS
    )

    private val modeKitIds by lazy {
        BedWarsTypeProvider
            .provide()
            .gameModes
            .values
            .mapNotNull { metadata ->
                val mode = metadata.mode as? BedWarsMode
                    ?: return@mapNotNull null

                mode to metadata.kitID
            }
            .toMap()
    }

    private fun tracked(
        profile: PracticeProfile,
        statistic: TrackedKitStatistic,
        kit: String
    ): Long
    {
        val id = statisticIdFrom(statistic) {
            kit(kit)
        }

        return profile.statistics()[id.toId()] ?: 0L
    }

    fun snapshot(profile: PracticeProfile): BedWarsProfileStatistics
    {
        BedWarsStatistics.ensureCustomStatisticsRegistered()

        val modeStats = BedWarsMode.entries.associateWith { mode ->
            val modeKit = modeKitIds[mode]
                ?: overallKit

            BedWarsModeProfileStatistics(
                mode = mode,
                plays = tracked(profile, TrackedKitStatistic.Plays, modeKit),
                wins = tracked(profile, TrackedKitStatistic.Wins, modeKit),
                losses = tracked(profile, TrackedKitStatistic.Losses, modeKit),
                kills = tracked(profile, TrackedKitStatistic.Kills, modeKit),
                deaths = tracked(profile, TrackedKitStatistic.Deaths, modeKit),
                bedsBroken = BedWarsStatistics.value(profile, BedWarsTrackedStatisticType.BedsBroken, mode),
                finalKills = BedWarsStatistics.value(profile, BedWarsTrackedStatisticType.FinalKills, mode),
                finalDeaths = BedWarsStatistics.value(profile, BedWarsTrackedStatisticType.FinalDeaths, mode)
            )
        }

        val coreModeStats = coreModes.mapNotNull { modeStats[it] }

        val modeWinStreaks = BedWarsMode.entries.associateWith { mode ->
            tracked(profile, TrackedKitStatistic.WinStreak, modeKitIds[mode] ?: overallKit)
        }

        val modeHighestWinStreaks = BedWarsMode.entries.associateWith { mode ->
            tracked(profile, TrackedKitStatistic.WinStreakHighest, modeKitIds[mode] ?: overallKit)
        }

        val globalWinStreak = tracked(profile, TrackedKitStatistic.WinStreak, overallKit)
        val globalHighestWinStreak = tracked(profile, TrackedKitStatistic.WinStreakHighest, overallKit)

        val fallbackCurrentWinStreak = coreModes.maxOfOrNull { mode ->
            modeWinStreaks[mode] ?: 0L
        } ?: 0L

        val fallbackHighestWinStreak = coreModes.maxOfOrNull { mode ->
            modeHighestWinStreaks[mode] ?: 0L
        } ?: 0L

        return BedWarsProfileStatistics(
            plays = coreModeStats.sumOf { it.plays },
            wins = coreModeStats.sumOf { it.wins },
            losses = coreModeStats.sumOf { it.losses },
            kills = coreModeStats.sumOf { it.kills },
            deaths = coreModeStats.sumOf { it.deaths },
            bedBreaks = coreModeStats.sumOf { it.bedsBroken },
            finalKills = coreModeStats.sumOf { it.finalKills },
            finalDeaths = coreModeStats.sumOf { it.finalDeaths },
            winStreak = if (globalWinStreak > 0L) globalWinStreak else fallbackCurrentWinStreak,
            highestWinStreak = if (globalHighestWinStreak > 0L) globalHighestWinStreak else fallbackHighestWinStreak,
            modeStatistics = modeStats
        )
    }
}
