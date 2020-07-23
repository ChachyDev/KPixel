package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Dragonwars(
    @SerializedName("kills")
    val kills: Int,
    @SerializedName("wins")
    val wins: Int
)