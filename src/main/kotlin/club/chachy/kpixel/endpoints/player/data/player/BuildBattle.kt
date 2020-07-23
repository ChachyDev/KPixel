package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class BuildBattle(
    @SerializedName("coins")
    val coins: Int,
    @SerializedName("correct_guesses")
    val correctGuesses: Int,
    @SerializedName("games_played")
    val gamesPlayed: Int,
    @SerializedName("loadout")
    val loadout: List<String>,
    @SerializedName("score")
    val score: Int,
    @SerializedName("selected_backdrop")
    val selectedBackdrop: String,
    @SerializedName("selected_hat")
    val selectedHat: String,
    @SerializedName("selected_movement_trail")
    val selectedMovementTrail: String,
    @SerializedName("selected_suit")
    val selectedSuit: String,
    @SerializedName("selected_victory_dance")
    val selectedVictoryDance: String,
    @SerializedName("super_votes")
    val superVotes: Int,
    @SerializedName("themeRatings")
    val themeRatings: ThemeRatings,
    @SerializedName("total_votes")
    val totalVotes: Int,
    @SerializedName("w_r")
    val wR: Int,
    @SerializedName("wins")
    val wins: Int,
    @SerializedName("wins_guess_the_build")
    val winsGuessTheBuild: Int,
    @SerializedName("wins_solo_normal")
    val winsSoloNormal: Int,
    @SerializedName("wins_solo_pro")
    val winsSoloPro: Int,
    @SerializedName("wins_teams_normal")
    val winsTeamsNormal: Int
)