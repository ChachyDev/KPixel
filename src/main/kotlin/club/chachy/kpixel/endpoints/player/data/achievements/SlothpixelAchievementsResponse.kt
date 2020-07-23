package club.chachy.kpixel.endpoints.player.data.achievements


import com.google.gson.annotations.SerializedName

data class SlothpixelAchievementsResponse(
    @SerializedName("achievement_points")
    val achievementPoints: Int,
    @SerializedName("completed_one_time")
    val completedOneTime: Int,
    @SerializedName("completed_tiered")
    val completedTiered: Int,
    @SerializedName("completed_total")
    val completedTotal: Int,
    @SerializedName("games")
    val games: Games,
    @SerializedName("rewards")
    val rewards: Rewards
)