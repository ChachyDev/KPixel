package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Perks(
    @SerializedName("carbine")
    val carbine: Carbine,
    @SerializedName("knife")
    val knife: Knife,
    @SerializedName("magnum")
    val magnum: Magnum,
    @SerializedName("pistol")
    val pistol: Pistol,
    @SerializedName("player")
    val player: Player,
    @SerializedName("rifle")
    val rifle: Rifle,
    @SerializedName("shotgun")
    val shotgun: Shotgun,
    @SerializedName("smg")
    val smg: Smg,
    @SerializedName("sniper")
    val sniper: Sniper
)