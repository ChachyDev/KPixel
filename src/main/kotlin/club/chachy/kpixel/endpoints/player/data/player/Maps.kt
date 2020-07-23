package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Maps(
    @SerializedName("canyon")
    val canyon: Canyon,
    @SerializedName("hypixelgp")
    val hypixelgp: Hypixelgp,
    @SerializedName("junglerush")
    val junglerush: Junglerush,
    @SerializedName("olympus")
    val olympus: Olympus,
    @SerializedName("retro")
    val retro: Retro
)