package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Prestige(
    @SerializedName("index")
    val index: Int,
    @SerializedName("timestamp")
    val timestamp: Int,
    @SerializedName("xp_on_prestige")
    val xpOnPrestige: Int
)