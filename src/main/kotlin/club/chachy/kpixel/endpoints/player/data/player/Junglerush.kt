package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Junglerush(
    @SerializedName("games")
    val games: Int,
    @SerializedName("trophies")
    val trophies: TrophiesXX,
    @SerializedName("win_ratio")
    val winRatio: Int
)