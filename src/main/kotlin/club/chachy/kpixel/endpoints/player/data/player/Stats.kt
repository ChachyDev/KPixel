package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Stats(
    @SerializedName("Arcade")
    val arcade: Arcade,
    @SerializedName("Arena")
    val arena: Arena,
    @SerializedName("BedWars")
    val bedWars: BedWars,
    @SerializedName("Blitz")
    val blitz: Blitz,
    @SerializedName("BuildBattle")
    val buildBattle: BuildBattle,
    @SerializedName("CvC")
    val cvC: CvC,
    @SerializedName("Duels")
    val duels: Duels,
    @SerializedName("MurderMystery")
    val murderMystery: MurderMystery,
    @SerializedName("Pit")
    val pit: Pit,
    @SerializedName("TKR")
    val tKR: TKR,
    @SerializedName("Warlords")
    val warlords: Warlords
)