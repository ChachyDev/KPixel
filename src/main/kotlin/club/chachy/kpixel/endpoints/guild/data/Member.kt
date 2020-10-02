package club.chachy.kpixel.endpoints.guild.data


import com.google.gson.annotations.SerializedName

data class Member(
    @SerializedName("exp_history")
    val expHistory: ExpHistoryX,
    @SerializedName("joined")
    val joined: Int,
    @SerializedName("muted_till")
    val mutedTill: Int,
    @SerializedName("quest_participation")
    val questParticipation: Int,
    @SerializedName("rank")
    val rank: String,
    @SerializedName("uuid")
    val uuid: String
)