package club.chachy.kpixel

import club.chachy.kpixel.endpoints.boosters.BoostersEndpoint
import club.chachy.kpixel.endpoints.guild.GuildEndpoint
import club.chachy.kpixel.endpoints.player.PlayerEndpoint

class KPixel(val token: String? = null) {
    val player = PlayerEndpoint()

    val guild = GuildEndpoint()

    val boosters = BoostersEndpoint()

}