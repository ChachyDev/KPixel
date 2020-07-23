package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("DISCORD")
    val dISCORD: String,
    @SerializedName("HYPIXEL")
    val hYPIXEL: String,
    @SerializedName("INSTAGRAM")
    val iNSTAGRAM: String,
    @SerializedName("MIXER")
    val mIXER: String,
    @SerializedName("TWITCH")
    val tWITCH: String,
    @SerializedName("TWITTER")
    val tWITTER: String,
    @SerializedName("YOUTUBE")
    val yOUTUBE: String
)