package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Hypixelgp(
    @SerializedName("games")
    val games: Int,
    @SerializedName("trophies")
    val trophies: TrophiesX,
    @SerializedName("win_ratio")
    val winRatio: Int
)