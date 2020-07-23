package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class OneVOne(
    @SerializedName("damage")
    val damage: Int,
    @SerializedName("deaths")
    val deaths: Int,
    @SerializedName("games")
    val games: Int,
    @SerializedName("healed")
    val healed: Int,
    @SerializedName("kd")
    val kd: Int,
    @SerializedName("kills")
    val kills: Int,
    @SerializedName("losses")
    val losses: Int,
    @SerializedName("win_loss")
    val winLoss: Int,
    @SerializedName("win_percentage")
    val winPercentage: Int,
    @SerializedName("win_streaks")
    val winStreaks: Int,
    @SerializedName("wins")
    val wins: Int
)