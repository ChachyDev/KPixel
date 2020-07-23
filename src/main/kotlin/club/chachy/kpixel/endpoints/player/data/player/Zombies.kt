package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Zombies(
    @SerializedName("best_round")
    val bestRound: Int,
    @SerializedName("bullets_hit")
    val bulletsHit: Int,
    @SerializedName("deaths")
    val deaths: Int,
    @SerializedName("doors_opened")
    val doorsOpened: Int,
    @SerializedName("headshots")
    val headshots: Int,
    @SerializedName("players_revived")
    val playersRevived: Int,
    @SerializedName("total_rounds_survived")
    val totalRoundsSurvived: Int,
    @SerializedName("windows_repaired")
    val windowsRepaired: Int,
    @SerializedName("wins")
    val wins: Int,
    @SerializedName("zombie_kills")
    val zombieKills: Int
)