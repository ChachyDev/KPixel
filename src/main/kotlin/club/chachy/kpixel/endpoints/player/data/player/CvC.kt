package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class CvC(
    @SerializedName("bombs_defused")
    val bombsDefused: Int,
    @SerializedName("bombs_planted")
    val bombsPlanted: Int,
    @SerializedName("coins")
    val coins: Int,
    @SerializedName("cop_kills")
    val copKills: Int,
    @SerializedName("criminal_kills")
    val criminalKills: Int,
    @SerializedName("deathmatch")
    val deathmatch: Deathmatch,
    @SerializedName("deaths")
    val deaths: Int,
    @SerializedName("grenade_kills")
    val grenadeKills: Int,
    @SerializedName("headshot_kills")
    val headshotKills: Int,
    @SerializedName("kd")
    val kd: Int,
    @SerializedName("kills")
    val kills: Int,
    @SerializedName("map_wins")
    val mapWins: MapWins,
    @SerializedName("monthly_kills")
    val monthlyKills: Int,
    @SerializedName("perks")
    val perks: Perks,
    @SerializedName("round_wins")
    val roundWins: Int,
    @SerializedName("selected_cosmetics")
    val selectedCosmetics: SelectedCosmetics,
    @SerializedName("selected_lobby_prefix")
    val selectedLobbyPrefix: String,
    @SerializedName("shots_fired")
    val shotsFired: Int,
    @SerializedName("show_lobby_prefix")
    val showLobbyPrefix: Boolean,
    @SerializedName("weekly_kills")
    val weeklyKills: Int,
    @SerializedName("wins")
    val wins: Int
)