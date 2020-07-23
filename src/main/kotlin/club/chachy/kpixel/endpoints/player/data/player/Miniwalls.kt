package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Miniwalls(
    @SerializedName("arrows_hit")
    val arrowsHit: Int,
    @SerializedName("arrows_shot")
    val arrowsShot: Int,
    @SerializedName("deaths")
    val deaths: Int,
    @SerializedName("final_kills")
    val finalKills: Int,
    @SerializedName("kills")
    val kills: Int,
    @SerializedName("kit")
    val kit: String,
    @SerializedName("wins")
    val wins: Int,
    @SerializedName("wither_damage")
    val witherDamage: Int,
    @SerializedName("wither_kills")
    val witherKills: Int
)