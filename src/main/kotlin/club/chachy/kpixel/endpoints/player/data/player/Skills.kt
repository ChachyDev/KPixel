package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Skills(
    @SerializedName("offensive")
    val offensive: String,
    @SerializedName("support")
    val support: String,
    @SerializedName("ultimate")
    val ultimate: String,
    @SerializedName("utility")
    val utility: String
)