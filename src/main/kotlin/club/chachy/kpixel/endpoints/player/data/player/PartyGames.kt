package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class PartyGames(
    @SerializedName("wins_1")
    val wins1: Int,
    @SerializedName("wins_2")
    val wins2: Int,
    @SerializedName("wins_3")
    val wins3: Int
)