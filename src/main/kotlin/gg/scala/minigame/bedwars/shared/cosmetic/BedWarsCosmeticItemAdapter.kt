package gg.scala.minigame.bedwars.shared.cosmetic

import gg.scala.minigame.bedwars.shared.profile.BedWarsProfile
import gg.scala.minigame.bedwars.shared.profile.BedWarsProfileService
import gg.tropic.practice.menu.cosmetic.TemplateCosmeticItem
import org.bukkit.Material
import org.bukkit.entity.Player

/**
 * @author Limo
 * @date 2/21/2026
 */
class BedWarsCosmeticItemAdapter(
    private val entry: CosmeticEntry
) : TemplateCosmeticItem
{
    override val id: String = entry.id
    override val displayName: String = entry.displayName
    override val description: List<String> = entry.description
    override val material: Material = entry.material
    override val materialData: Short = entry.materialData
    override val skullTexture: String? = entry.skullTexture
    override val rarityDisplayName: String = entry.rarity.displayName
    override val rarityColorCode: String = entry.rarity.colorCode
    override val raritySortOrder: Int = entry.rarity.sortOrder
    override val cost: Long = entry.rarity.cost

    fun entry() = entry
}
