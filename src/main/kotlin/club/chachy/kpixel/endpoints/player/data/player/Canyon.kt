package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Canyon(
    @SerializedName("games")
    val games: Int,
    @SerializedName("trophies")
    val trophies: Trophies,
    @SerializedName("win_ratio")
    val winRatio: Int
)