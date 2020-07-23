package club.chachy.kpixel.endpoints.player.data.quests


import com.google.gson.annotations.SerializedName

data class SlothpixelQuestResponse(
    @SerializedName("challenges_completed")
    val challengesCompleted: Int,
    @SerializedName("completions")
    val completions: Completions,
    @SerializedName("quests_completed")
    val questsCompleted: Int
)