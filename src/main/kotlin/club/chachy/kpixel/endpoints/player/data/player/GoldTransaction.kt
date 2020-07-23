package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class GoldTransaction(
    @SerializedName("amount")
    val amount: Int,
    @SerializedName("timestamp")
    val timestamp: Int
)