package gg.scala.minigame.bedwars.shared.cosmetic

import net.evilblock.cubed.util.math.Numbers
import org.bukkit.Material

/**
 * @author Limo
 * @date 2/20/2026
 */
data class CosmeticEntry(
    val id: String,
    val displayName: String,
    val description: List<String>,
    val material: Material,
    val materialData: Short = 0,
    val rarity: CosmeticRarity,
    val skullTexture: String? = null
)
{
    fun buildLore(
        categoryName: String,
        isSelected: Boolean,
        isOwned: Boolean,
        previewable: Boolean = false
    ): List<String>
    {
        val lore = mutableListOf<String>()
        lore += "\u00a78$categoryName"
        lore += ""
        lore += description
        lore += ""

        if (previewable && rarity != CosmeticRarity.NONE)
        {
            lore += "\u00a7eRight-Click to preview!"
            lore += ""
        }

        lore += "\u00a77Rarity: ${rarity.colored()}"

        if (!rarity.isFree() && !isOwned)
        {
            lore += "\u00a77Cost: \u00a76${Numbers.format(rarity.cost)} coins"
        }

        lore += ""

        if (isSelected)
        {
            lore += "\u00a7aSelected"
            lore += "\u00a7eClick to deselect!"
        }
        else if (isOwned || rarity.isFree())
        {
            lore += "\u00a7aUnlocked"
            lore += "\u00a7eClick to select!"
        }
        else
        {
            lore += "\u00a7cLocked"
            lore += "\u00a7eClick to purchase!"
        }

        return lore
    }
}
