package gg.scala.minigame.bedwars.shared.profile

import gg.scala.commons.persist.ProfileOrchestrator
import gg.scala.flavor.service.Service
import java.util.UUID

/**
 * @author Limo
 * @date 2/13/2026
 */
@Service
object BedWarsProfileService : ProfileOrchestrator<BedWarsProfile>()
{
    override fun new(uniqueId: UUID) = BedWarsProfile(uniqueId)
    override fun type() = BedWarsProfile::class
}
