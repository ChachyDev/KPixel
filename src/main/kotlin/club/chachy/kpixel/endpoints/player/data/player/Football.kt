package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Football(
    @SerializedName("goals")
    val goals: Int,
    @SerializedName("powerkicks")
    val powerkicks: Int,
    @SerializedName("wins")
    val wins: Int
)