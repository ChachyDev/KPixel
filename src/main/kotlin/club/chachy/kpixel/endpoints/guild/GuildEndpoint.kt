package club.chachy.kpixel.endpoints.guild

import club.chachy.kpixel.endpoints.Endpoint
import club.chachy.kpixel.endpoints.guild.data.GuildStatsResponse
import club.chachy.kpixel.utils.getSlothpixelRoute
import club.chachy.kpixel.utils.http
import java.util.*

class GuildEndpoint(token: String? = null) : Endpoint(token) {
    suspend fun getGuildStatsByUsername(username: String) =
        http.getSlothpixelRoute<GuildStatsResponse>("/guilds/$username", token)

    suspend fun getGuildStatsByUUID(uuid: UUID) =
        http.getSlothpixelRoute<GuildStatsResponse>("/guilds/$uuid", token)
}