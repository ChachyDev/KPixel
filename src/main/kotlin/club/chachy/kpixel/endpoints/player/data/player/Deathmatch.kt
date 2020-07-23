package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Deathmatch(
    @SerializedName("cop_kills")
    val copKills: Int,
    @SerializedName("criminal_kills")
    val criminalKills: Int,
    @SerializedName("deaths")
    val deaths: Int,
    @SerializedName("kd")
    val kd: Int,
    @SerializedName("kills")
    val kills: Int,
    @SerializedName("wins")
    val wins: Int
)