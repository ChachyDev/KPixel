package club.chachy.kpixel.endpoints.player.data.status


import com.google.gson.annotations.SerializedName

data class Game(
    @SerializedName("map")
    val map: String,
    @SerializedName("mode")
    val mode: String,
    @SerializedName("type")
    val type: String
)