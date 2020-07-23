package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class HoleInTheWall(
    @SerializedName("highest_score_finals")
    val highestScoreFinals: Int,
    @SerializedName("highest_score_qualification")
    val highestScoreQualification: Int,
    @SerializedName("rounds")
    val rounds: Int,
    @SerializedName("wins")
    val wins: Int
)