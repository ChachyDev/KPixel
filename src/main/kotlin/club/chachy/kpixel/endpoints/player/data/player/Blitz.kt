package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Blitz(
    @SerializedName("arrows_fired")
    val arrowsFired: Int,
    @SerializedName("arrows_hit")
    val arrowsHit: Int,
    @SerializedName("blitz_uses")
    val blitzUses: Int,
    @SerializedName("chests_opened")
    val chestsOpened: Int,
    @SerializedName("coins")
    val coins: Int,
    @SerializedName("damage")
    val damage: Int,
    @SerializedName("damage_taken")
    val damageTaken: Int,
    @SerializedName("deaths")
    val deaths: Int,
    @SerializedName("equipped")
    val equipped: Equipped,
    @SerializedName("games_played")
    val gamesPlayed: Int,
    @SerializedName("inventories")
    val inventories: Inventories,
    @SerializedName("k_d")
    val kD: Int,
    @SerializedName("kills")
    val kills: Int,
    @SerializedName("kit_stats")
    val kitStats: KitStats,
    @SerializedName("kits_levels")
    val kitsLevels: KitsLevels,
    @SerializedName("mobs_spawned")
    val mobsSpawned: Int,
    @SerializedName("monthly_kills")
    val monthlyKills: Int,
    @SerializedName("potions_drunk")
    val potionsDrunk: Int,
    @SerializedName("potions_thrown")
    val potionsThrown: Int,
    @SerializedName("rambo_wins")
    val ramboWins: Int,
    @SerializedName("random_wins")
    val randomWins: Int,
    @SerializedName("settings")
    val settings: Settings,
    @SerializedName("taunt_kills")
    val tauntKills: Int,
    @SerializedName("team_wins")
    val teamWins: Int,
    @SerializedName("time_played")
    val timePlayed: Int,
    @SerializedName("weekly_kills")
    val weeklyKills: Int,
    @SerializedName("win_loss")
    val winLoss: Int,
    @SerializedName("win_percentage")
    val winPercentage: Int,
    @SerializedName("wins")
    val wins: Int
)