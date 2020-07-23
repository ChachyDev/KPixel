package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class SelectedCosmetics(
    @SerializedName("carbine")
    val carbine: String,
    @SerializedName("knife")
    val knife: String,
    @SerializedName("magnum")
    val magnum: String,
    @SerializedName("pistol")
    val pistol: String,
    @SerializedName("rifle")
    val rifle: String,
    @SerializedName("shotgun")
    val shotgun: String,
    @SerializedName("smg")
    val smg: String
)