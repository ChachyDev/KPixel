package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Boxes(
    @SerializedName("commons")
    val commons: Int,
    @SerializedName("current")
    val current: Int,
    @SerializedName("epics")
    val epics: Int,
    @SerializedName("legendaries")
    val legendaries: Int,
    @SerializedName("opened")
    val opened: Int,
    @SerializedName("rares")
    val rares: Int
)