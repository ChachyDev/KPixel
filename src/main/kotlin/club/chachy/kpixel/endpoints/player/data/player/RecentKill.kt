package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class RecentKill(
    @SerializedName("timestamp")
    val timestamp: Int,
    @SerializedName("victim")
    val victim: String
)