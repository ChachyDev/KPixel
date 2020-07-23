package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Arcade(
    @SerializedName("blocking_dead")
    val blockingDead: BlockingDead,
    @SerializedName("bounty_hunters")
    val bountyHunters: BountyHunters,
    @SerializedName("coins")
    val coins: Int,
    @SerializedName("creeper_attack")
    val creeperAttack: CreeperAttack,
    @SerializedName("dragonwars")
    val dragonwars: Dragonwars,
    @SerializedName("farm_hunt")
    val farmHunt: FarmHunt,
    @SerializedName("football")
    val football: Football,
    @SerializedName("galaxy_wars")
    val galaxyWars: GalaxyWars,
    @SerializedName("hole_in_the_wall")
    val holeInTheWall: HoleInTheWall,
    @SerializedName("hypixel_says")
    val hypixelSays: HypixelSays,
    @SerializedName("miniwalls")
    val miniwalls: Miniwalls,
    @SerializedName("party_games")
    val partyGames: PartyGames,
    @SerializedName("santa_says")
    val santaSays: SantaSays,
    @SerializedName("zombies")
    val zombies: Zombies
)