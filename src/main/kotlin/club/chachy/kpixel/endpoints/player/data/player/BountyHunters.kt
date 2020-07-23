package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class BountyHunters(
    @SerializedName("bounty_kills")
    val bountyKills: Int,
    @SerializedName("deaths")
    val deaths: Int,
    @SerializedName("kills")
    val kills: Int,
    @SerializedName("wins")
    val wins: Int
)