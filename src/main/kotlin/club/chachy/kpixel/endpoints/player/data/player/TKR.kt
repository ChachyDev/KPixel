package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class TKR(
    @SerializedName("banana_ratio")
    val bananaRatio: Int,
    @SerializedName("bananas_received")
    val bananasReceived: Int,
    @SerializedName("bananas_sent")
    val bananasSent: Int,
    @SerializedName("box_pickups")
    val boxPickups: Int,
    @SerializedName("coin_pickups")
    val coinPickups: Int,
    @SerializedName("coins")
    val coins: Int,
    @SerializedName("laps")
    val laps: Int,
    @SerializedName("maps")
    val maps: Maps,
    @SerializedName("trophies")
    val trophies: TrophiesXXXXX,
    @SerializedName("wins")
    val wins: Int
)