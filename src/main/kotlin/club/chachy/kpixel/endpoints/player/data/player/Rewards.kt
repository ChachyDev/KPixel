package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Rewards(
    @SerializedName("claimed")
    val claimed: Int,
    @SerializedName("claimed_daily")
    val claimedDaily: Int,
    @SerializedName("streak_best")
    val streakBest: Int,
    @SerializedName("streak_current")
    val streakCurrent: Int,
    @SerializedName("tokens")
    val tokens: Int
)