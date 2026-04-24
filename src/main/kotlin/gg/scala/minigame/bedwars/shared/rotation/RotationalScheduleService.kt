package gg.scala.minigame.bedwars.shared.rotation

import gg.scala.store.controller.DataStoreObjectController
import gg.scala.store.controller.DataStoreObjectControllerCache
import gg.scala.store.storage.type.DataStoreStorageType

/**
 * @author Limo
 * @date 2/18/2026
 */
object RotationalScheduleService
{
    lateinit var controller: DataStoreObjectController<RotationalSchedule>
        private set

    @Volatile
    var schedule: RotationalSchedule = RotationalSchedule()
        private set

    fun subscribe()
    {
        controller = DataStoreObjectControllerCache
            .create<RotationalSchedule>()
        controller.preLoadResources()

        val loaded = controller.load(
            RotationalSchedule.SINGLETON_ID,
            DataStoreStorageType.MONGO
        ).join()

        if (loaded != null)
        {
            schedule = loaded
        }
        else
        {
            rotate()
        }

        if (schedule.isRotationDue())
        {
            rotate()
        }
    }

    fun activeItems(): List<RotationalItemDefinition> = schedule.activeDefinitions()

    fun setActiveItems(items: List<RotationalItemDefinition>)
    {
        schedule.activeItems = items.map { it.id }.toMutableList()
        schedule.lastRotationEpoch = System.currentTimeMillis()
        schedule.save()
    }

    fun rotate()
    {
        val pool = RotationalItemDefinition.entries
            .filter { it.id !in schedule.activeItems }
            .shuffled()
            .take(2)

        schedule.activeItems = pool.map { it.id }.toMutableList()
        schedule.lastRotationEpoch = System.currentTimeMillis()
        schedule.save()
    }

    fun timeUntilNextRotation(): Long
    {
        val elapsed = System.currentTimeMillis() - schedule.lastRotationEpoch
        return (RotationalSchedule.ROTATION_INTERVAL_MS - elapsed).coerceAtLeast(0L)
    }
}
