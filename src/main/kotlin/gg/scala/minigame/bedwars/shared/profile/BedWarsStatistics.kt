package gg.scala.minigame.bedwars.shared.profile

import gg.scala.minigame.bedwars.shared.BedWarsMode
import gg.tropic.practice.statistics.ExpiringStatistic
import gg.tropic.practice.profile.PracticeProfile
import gg.tropic.practice.statistics.IncrementalStatistic
import gg.tropic.practice.statistics.Statistic
import gg.tropic.practice.statistics.StatisticID
import gg.tropic.practice.statistics.StatisticLifetime
import gg.tropic.practice.statistics.StatisticService
import gg.tropic.practice.statistics.statisticWrite
import java.util.UUID

/**
 * @author Limo
 * @date 2/13/2026
 */
enum class BedWarsTrackedStatisticType(
    val key: String
)
{
    BedsBroken("beds-broken"),
    FinalKills("final-kills"),
    FinalDeaths("final-deaths")
}

/**
 * @author Limo
 * @date 2/13/2026
 */
object BedWarsStatistics
{
    private var customStatisticsRegistered = false

    private fun coreId(type: BedWarsTrackedStatisticType) = StatisticID
        .fromCustom("bedwars:core:${type.key}")

    private fun modeId(mode: BedWarsMode, type: BedWarsTrackedStatisticType) = StatisticID
        .fromCustom("bedwars:mode:${mode.name.lowercase()}:${type.key}")

    private fun coreWindowId(type: BedWarsTrackedStatisticType, lifetime: StatisticLifetime) = StatisticID
        .fromCustom(
            id = "bedwars:core:${type.key}:${lifetime.name.lowercase()}",
            lifetime = lifetime
        )

    private fun modeWindowId(
        mode: BedWarsMode,
        type: BedWarsTrackedStatisticType,
        lifetime: StatisticLifetime
    ) = StatisticID.fromCustom(
        id = "bedwars:mode:${mode.name.lowercase()}:${type.key}:${lifetime.name.lowercase()}",
        lifetime = lifetime
    )

    fun ensureCustomStatisticsRegistered()
    {
        if (customStatisticsRegistered)
        {
            return
        }

        customStatisticsRegistered = true
        StatisticService.provideCustomStatistics {
            val tracked = mutableListOf<Statistic>()

            BedWarsTrackedStatisticType.entries.forEach { type ->
                tracked += IncrementalStatistic(coreId(type))
                StatisticLifetime.entries.forEach { lifetime ->
                    tracked += ExpiringStatistic(
                        id = coreWindowId(type, lifetime),
                        lifetime = lifetime
                    )
                }

                BedWarsMode.entries.forEach { mode ->
                    tracked += IncrementalStatistic(modeId(mode, type))
                    StatisticLifetime.entries.forEach { lifetime ->
                        tracked += ExpiringStatistic(
                            id = modeWindowId(mode, type, lifetime),
                            lifetime = lifetime
                        )
                    }
                }
            }

            tracked
        }
    }

    fun increment(
        player: UUID,
        mode: BedWarsMode,
        type: BedWarsTrackedStatisticType,
        amount: Long = 1L
    )
    {
        ensureCustomStatisticsRegistered()

        StatisticService.update(player) {
            val statistics = mutableListOf(
                coreId(type),
                modeId(mode, type)
            )

            StatisticLifetime.entries.forEach { lifetime ->
                statistics += coreWindowId(type, lifetime)
                statistics += modeWindowId(mode, type, lifetime)
            }

            statisticWrite(statistics) {
                add(amount)
            }
        }
    }

    fun value(
        profile: PracticeProfile,
        type: BedWarsTrackedStatisticType,
        mode: BedWarsMode? = null
    ): Long
    {
        val id = mode?.let { modeId(it, type) } ?: coreId(type)
        return profile.statistics()[id.toId()] ?: 0L
    }
}
