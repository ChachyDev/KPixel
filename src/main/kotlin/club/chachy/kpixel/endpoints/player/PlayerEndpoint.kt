package club.chachy.kpixel.endpoints.player

import club.chachy.kpixel.endpoints.Endpoint
import club.chachy.kpixel.endpoints.player.data.achievements.SlothpixelAchievementsResponse
import club.chachy.kpixel.endpoints.player.data.games.SlothpixelRecentGamesResponse
import club.chachy.kpixel.endpoints.player.data.player.SlothpixelPlayerResponse
import club.chachy.kpixel.endpoints.player.data.quests.SlothpixelQuestResponse
import club.chachy.kpixel.endpoints.player.data.status.SlothpixelCurrentPlayerActivityResponse
import club.chachy.kpixel.utils.getSlothpixelRoute
import club.chachy.kpixel.utils.http
import java.util.UUID

class PlayerEndpoint(token: String? = null) : Endpoint(token) {
    /**
     * Grabs all statistics about the player from the api.
     *
     * @param username The username of the player
     * @author ChachyDev
     * @since 0.1-PRE
     * @note It is recommended to use UUID due to the fact that using username takes slower.
     */

    suspend fun getPlayer(username: String) =
        http.getSlothpixelRoute<SlothpixelPlayerResponse>("/players/$username", token)

    /**
     * Grabs all statistics about the player from the api.
     *
     * @param uuid The uuid of the player
     * @author ChachyDev
     * @since 0.1-PRE
     */

    suspend fun getPlayer(uuid: UUID) = http.getSlothpixelRoute<SlothpixelPlayerResponse>("/players/$uuid", token)

    /**
     * Grabs the in depth achievement stats of a player
     *
     * @param username The username of the player
     * @author ChachyDev
     * @since 0.1-PRE
     * @note It is recommended to use UUID due to the fact that using username takes slower.
     */
    suspend fun getInDepthAchievementStats(username: String) =
        http.getSlothpixelRoute<SlothpixelAchievementsResponse>("/players/$username/achievements", token)

    /**
     * Grabs the in depth achievement stats of a player
     *
     * @param uuid The UUID of the player
     * @author ChachyDev
     * @since 0.1-PRE
     */
    suspend fun getInDepthAchievementStats(uuid: UUID) =
        http.getSlothpixelRoute<SlothpixelAchievementsResponse>("/players/$uuid/achievements", token)

    /**
     * Grabs the in depth quest data of a player
     *
     * @param username The username of the player
     * @author ChachyDev
     * @since 0.1-PRE
     * @note It is recommended to use UUID due to the fact that using username takes slower.
     */
    suspend fun getInDepthQuestData(username: String) =
        http.getSlothpixelRoute<SlothpixelQuestResponse>("/players/$username/quests", token)

    /**
     * Grabs the in depth quest data of a player
     *
     * @param uuid The uuid of the player
     * @author ChachyDev
     * @since 0.1-PRE
     */
    suspend fun getInDepthQuestData(uuid: UUID) =
        http.getSlothpixelRoute<SlothpixelQuestResponse>("/players/$uuid/quests", token)

    /**
     * Grabs the recent played games of a player
     *
     * @param username The username of the player
     * @author ChachyDev
     * @since 0.1-PRE
     * @note It is recommended to use UUID due to the fact that using username takes slower.
     */
    suspend fun getRecentGamesPlayed(username: String) =
        http.getSlothpixelRoute<SlothpixelRecentGamesResponse>("/players/$username/recentGames", token)

    /**
     * Grabs the recent played games of a player
     *
     * @param uuid The uuid of the player
     * @author ChachyDev
     * @since 0.1-PRE
     */

    suspend fun getRecentGamesPlayed(uuid: UUID) =
        http.getSlothpixelRoute<SlothpixelRecentGamesResponse>("/players/$uuid/recentGames", token)

    /**
     * Grabs the players current activity
     *
     * @param username The username of the player
     * @author ChachyDev
     * @since 0.1-PRE
     * @note It is recommended to use UUID due to the fact that using username takes slower.
     */

    suspend fun getCurrentPlayerActivity(username: String) =
        http.getSlothpixelRoute<SlothpixelCurrentPlayerActivityResponse>("/players/$username/status", token)

    /**
     * Grabs the players current activity
     *
     * @param uuid The uuid of the player
     * @author ChachyDev
     * @since 0.1-PRE
     */

    suspend fun getCurrentPlayerActivity(uuid: UUID) =
        http.getSlothpixelRoute<SlothpixelCurrentPlayerActivityResponse>("/players/$uuid/status", token)
}