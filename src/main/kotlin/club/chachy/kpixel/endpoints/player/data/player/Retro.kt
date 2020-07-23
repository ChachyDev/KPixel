package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Retro(
    @SerializedName("games")
    val games: Int,
    @SerializedName("trophies")
    val trophies: TrophiesXXXX,
    @SerializedName("win_ratio")
    val winRatio: Int
)