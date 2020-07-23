package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Voting(
    @SerializedName("last_vote")
    val lastVote: Int,
    @SerializedName("total_votes")
    val totalVotes: Int,
    @SerializedName("votes_today")
    val votesToday: Int
)