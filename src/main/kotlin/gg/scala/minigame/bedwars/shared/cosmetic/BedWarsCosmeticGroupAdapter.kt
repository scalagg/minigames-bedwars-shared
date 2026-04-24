package gg.scala.minigame.bedwars.shared.cosmetic

import gg.scala.minigame.bedwars.shared.profile.BedWarsProfile
import gg.scala.minigame.bedwars.shared.profile.BedWarsProfileService
import gg.tropic.practice.menu.cosmetic.TemplateCosmeticGroup
import gg.tropic.practice.menu.cosmetic.TemplateCosmeticItem
import org.bukkit.Material
import org.bukkit.entity.Player

/**
 * @author Limo
 * @date 2/21/2026
 */
class BedWarsCosmeticGroupAdapter(
    private val category: CosmeticCategory
) : TemplateCosmeticGroup
{
    override val groupId: String = category.name
    override val displayName: String = category.displayName
    override val description: List<String> = category.description
    override val iconMaterial: Material = category.iconMaterial
    override val iconData: Short = category.iconData
    override val menuSlot: Int = category.menuSlot
    override val previewable: Boolean = category.previewable
    override val skullTexture: String? = category.skullTexture

    fun category() = category

    private val cachedItems: List<TemplateCosmeticItem> by lazy {
        category.entries().map { BedWarsCosmeticItemAdapter(it) }
    }

    override fun entries(): List<TemplateCosmeticItem> = cachedItems

    private fun profile(player: Player): BedWarsProfile?
    {
        return BedWarsProfileService.find(player)
    }

    override fun selectedId(player: Player): String
    {
        return profile(player)?.let { category.selectedId(it) } ?: "none"
    }

    override fun select(player: Player, id: String)
    {
        val p = profile(player) ?: return
        category.select(p, id)
    }

    override fun ownedIds(player: Player): Set<String>
    {
        val p = profile(player) ?: return setOf(selectedId(player))
        return BedWarsCosmeticOwnership.ownedIds(p, category)
    }

    override fun ownedCount(player: Player): Int
    {
        val p = profile(player) ?: return 0
        return BedWarsCosmeticOwnership.ownedCount(p, category)
    }

    override fun unlock(player: Player, id: String): Boolean
    {
        val p = profile(player) ?: return false
        return BedWarsCosmeticOwnership.unlock(p, category, id)
    }

    override fun saveProfile(player: Player)
    {
        profile(player)?.save()
    }

    companion object
    {
        private val allGroups: List<BedWarsCosmeticGroupAdapter> by lazy {
            CosmeticCategory.values().map { BedWarsCosmeticGroupAdapter(it) }
        }

        fun allGroups(): List<BedWarsCosmeticGroupAdapter> = allGroups

        fun fromCategory(category: CosmeticCategory): BedWarsCosmeticGroupAdapter
        {
            return allGroups.first { it.category == category }
        }
    }
}
