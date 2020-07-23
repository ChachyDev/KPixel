package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class BlockingDead(
    @SerializedName("headshots")
    val headshots: Int,
    @SerializedName("wins")
    val wins: Int,
    @SerializedName("zombie_kills")
    val zombieKills: Int
)