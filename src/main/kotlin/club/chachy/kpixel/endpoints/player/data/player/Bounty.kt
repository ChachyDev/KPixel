package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Bounty(
    @SerializedName("amount")
    val amount: Int,
    @SerializedName("issuer")
    val issuer: String,
    @SerializedName("remainingTicks")
    val remainingTicks: Int,
    @SerializedName("timestamp")
    val timestamp: Int
)