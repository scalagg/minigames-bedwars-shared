package gg.scala.minigame.bedwars.shared.cosmetic

import gg.scala.minigame.bedwars.shared.profile.BedWarsProfile

/**
 * @author Limo
 * @date 2/21/2026
 */
object BedWarsCosmeticOwnership
{
    private fun key(category: CosmeticCategory): String
    {
        return category.name.lowercase()
    }

    @Suppress("UNCHECKED_CAST")
    private fun mutableOwnedCosmetics(profile: BedWarsProfile): MutableMap<String, MutableList<String>>
    {
        val field = profile::class.java.getDeclaredField("ownedCosmetics")
        field.isAccessible = true

        val current = field.get(profile) as? MutableMap<String, MutableList<String>>
        if (current != null)
        {
            return current
        }

        val fallback = mutableMapOf<String, MutableList<String>>()
        field.set(profile, fallback)
        return fallback
    }

    fun ownedIds(profile: BedWarsProfile, category: CosmeticCategory): Set<String>
    {
        val owned = mutableOwnedCosmetics(profile)[key(category)]
            ?.toMutableSet()
            ?: mutableSetOf()

        val selected = runCatching { category.selectedId(profile) }.getOrNull()
        if (selected != null && selected.isNotBlank())
        {
            owned += selected
        }

        return owned
    }

    fun unlock(profile: BedWarsProfile, category: CosmeticCategory, id: String): Boolean
    {
        val categoryKey = key(category)
        val owned = mutableOwnedCosmetics(profile).getOrPut(categoryKey) { mutableListOf() }

        if (owned.contains(id))
        {
            return false
        }

        owned += id
        return true
    }

    fun ownedCount(profile: BedWarsProfile, category: CosmeticCategory): Int
    {
        val owned = ownedIds(profile, category)
        return category.entries().count { owned.contains(it.id) }
    }
}
