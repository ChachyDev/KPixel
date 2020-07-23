package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class TrophiesXXX(
    @SerializedName("bronze")
    val bronze: Int,
    @SerializedName("gold")
    val gold: Int,
    @SerializedName("silver")
    val silver: Int
)