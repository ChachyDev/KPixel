package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class FarmHunt(
    @SerializedName("poop_collected")
    val poopCollected: Int,
    @SerializedName("wins")
    val wins: Int
)