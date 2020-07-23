package club.chachy.kpixel

import club.chachy.kpixel.endpoints.player.PlayerEndpoint

class KPixel(val token: String? = null) {
    fun getPlayer() {
        val p = PlayerEndpoint()
    }
}