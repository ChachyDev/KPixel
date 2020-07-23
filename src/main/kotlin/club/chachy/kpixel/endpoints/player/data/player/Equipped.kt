package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Equipped(
    @SerializedName("aura")
    val aura: String,
    @SerializedName("finisher")
    val finisher: String,
    @SerializedName("taunt")
    val taunt: String,
    @SerializedName("victory_dance")
    val victoryDance: String
)