package club.chachy.kpixel.endpoints.player.data.games


import com.google.gson.annotations.SerializedName

data class SlothpixelRecentGamesResponseItem(
    @SerializedName("date")
    val date: Int,
    @SerializedName("gameType")
    val gameType: String,
    @SerializedName("map")
    val map: String,
    @SerializedName("mode")
    val mode: String
)