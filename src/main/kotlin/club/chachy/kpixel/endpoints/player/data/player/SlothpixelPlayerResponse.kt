package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class SlothpixelPlayerResponse(
    @SerializedName("achievement_points")
    val achievementPoints: Int,
    @SerializedName("exp")
    val exp: Int,
    @SerializedName("first_login")
    val firstLogin: Int,
    @SerializedName("gifts_received")
    val giftsReceived: Int,
    @SerializedName("gifts_sent")
    val giftsSent: Int,
    @SerializedName("is_contributor")
    val isContributor: Boolean,
    @SerializedName("karma")
    val karma: Int,
    @SerializedName("language")
    val language: String,
    @SerializedName("last_game")
    val lastGame: String,
    @SerializedName("last_login")
    val lastLogin: Int,
    @SerializedName("last_logout")
    val lastLogout: Int,
    @SerializedName("level")
    val level: Int,
    @SerializedName("links")
    val links: Links,
    @SerializedName("mc_version")
    val mcVersion: String,
    @SerializedName("online")
    val online: Boolean,
    @SerializedName("prefix")
    val prefix: String,
    @SerializedName("quests_completed")
    val questsCompleted: Int,
    @SerializedName("rank")
    val rank: String,
    @SerializedName("rank_formatted")
    val rankFormatted: String,
    @SerializedName("rank_plus_color")
    val rankPlusColor: String,
    @SerializedName("rewards")
    val rewards: Rewards,
    @SerializedName("stats")
    val stats: Stats,
    @SerializedName("total_coins")
    val totalCoins: Int,
    @SerializedName("total_kills")
    val totalKills: Int,
    @SerializedName("total_wins")
    val totalWins: Int,
    @SerializedName("username")
    val username: String,
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("voting")
    val voting: Voting
)