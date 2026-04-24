package gg.scala.minigame.bedwars.shared.rotation

import gg.scala.store.controller.DataStoreObjectControllerCache
import gg.scala.store.storage.storable.IDataStoreObject
import gg.scala.store.storage.type.DataStoreStorageType
import java.util.UUID

/**
 * @author Limo
 * @date 2/18/2026
 */
data class RotationalSchedule(
    override val identifier: UUID = SINGLETON_ID,
    var activeItems: MutableList<String> = mutableListOf(),
    var lastRotationEpoch: Long = 0L
) : IDataStoreObject
{
    companion object
    {
        val SINGLETON_ID: UUID = UUID.fromString("00000000-0000-0000-0000-bed0a5507a7e")
        const val ROTATION_INTERVAL_MS = 7L * 24 * 60 * 60 * 1000 
    }

    fun activeDefinitions(): List<RotationalItemDefinition>
    {
        return activeItems.mapNotNull { id ->
            RotationalItemDefinition.entries.firstOrNull { it.id == id }
        }
    }

    fun isRotationDue(): Boolean
    {
        if (activeItems.isEmpty()) return true
        return System.currentTimeMillis() - lastRotationEpoch >= ROTATION_INTERVAL_MS
    }

    fun save()
    {
        DataStoreObjectControllerCache
            .findNotNull<RotationalSchedule>()
            .save(this, DataStoreStorageType.MONGO)
    }
}
