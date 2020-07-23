package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Olympus(
    @SerializedName("games")
    val games: Int,
    @SerializedName("trophies")
    val trophies: TrophiesXXX,
    @SerializedName("win_ratio")
    val winRatio: Int
)