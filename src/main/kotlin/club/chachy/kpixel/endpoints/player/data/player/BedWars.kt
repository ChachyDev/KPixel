package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class BedWars(
    @SerializedName("bed_ratio")
    val bedRatio: Int,
    @SerializedName("beds_broken")
    val bedsBroken: Int,
    @SerializedName("beds_lost")
    val bedsLost: Int,
    @SerializedName("boxes")
    val boxes: Boxes,
    @SerializedName("coins")
    val coins: Int,
    @SerializedName("deaths")
    val deaths: Int,
    @SerializedName("exp")
    val exp: Int,
    @SerializedName("final_deaths")
    val finalDeaths: Int,
    @SerializedName("final_k_d")
    val finalKD: Int,
    @SerializedName("final_kills")
    val finalKills: Int,
    @SerializedName("gamemodes")
    val gamemodes: GamemodesX,
    @SerializedName("games_played")
    val gamesPlayed: Int,
    @SerializedName("k_d")
    val kD: Int,
    @SerializedName("kills")
    val kills: Int,
    @SerializedName("level")
    val level: Int,
    @SerializedName("losses")
    val losses: Int,
    @SerializedName("resources_collected")
    val resourcesCollected: ResourcesCollected,
    @SerializedName("void_deaths")
    val voidDeaths: Int,
    @SerializedName("void_kills")
    val voidKills: Int,
    @SerializedName("w_l")
    val wL: Int,
    @SerializedName("wins")
    val wins: Int,
    @SerializedName("winstreak")
    val winstreak: Int
)