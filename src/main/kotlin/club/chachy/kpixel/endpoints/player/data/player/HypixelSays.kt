package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class HypixelSays(
    @SerializedName("rounds")
    val rounds: Int,
    @SerializedName("wins")
    val wins: Int
)