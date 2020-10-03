package club.chachy.kpixel.endpoints.boosters

import club.chachy.kpixel.endpoints.Endpoint
import club.chachy.kpixel.endpoints.boosters.data.Booster
import club.chachy.kpixel.endpoints.boosters.data.BoostersObject
import club.chachy.kpixel.utils.getSlothpixelRoute
import club.chachy.kpixel.utils.http
import org.jetbrains.annotations.NotNull

/**
 * https://docs.slothpixel.me/#tag/boosters
 * List of Boosters
 *
 * @author Filip
 */
class BoostersEndpoint(token: String? = null) : Endpoint(token) {

    /**
     * @since 0.1-PRE
     * @return [BoostersObject] for all server gamemodes
     */
    suspend fun getBoosters(): BoostersObject =
        http.getSlothpixelRoute("/boosters", token)


    /**
     * @param game Standard minigame name
     * @since 0.1-PRE
     * @return A list of [Booster] for a specific
     */
    suspend fun getBoosters(@NotNull game: String): ArrayList<Booster> = http.getSlothpixelRoute("/boosters/$game", token)

}