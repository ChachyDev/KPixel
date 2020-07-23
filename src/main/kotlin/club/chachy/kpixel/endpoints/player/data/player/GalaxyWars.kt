package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class GalaxyWars(
    @SerializedName("deaths")
    val deaths: Int,
    @SerializedName("kills")
    val kills: Int,
    @SerializedName("rebel_kills")
    val rebelKills: Int,
    @SerializedName("shots_fired")
    val shotsFired: Int,
    @SerializedName("wins")
    val wins: Int
)