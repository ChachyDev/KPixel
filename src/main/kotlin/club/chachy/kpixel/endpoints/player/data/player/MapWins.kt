package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class MapWins(
    @SerializedName("alleyway")
    val alleyway: Int,
    @SerializedName("atomic")
    val atomic: Int,
    @SerializedName("carrier")
    val carrier: Int,
    @SerializedName("melon_factory")
    val melonFactory: Int,
    @SerializedName("overgrown")
    val overgrown: Int,
    @SerializedName("reserve")
    val reserve: Int,
    @SerializedName("sandstorm")
    val sandstorm: Int,
    @SerializedName("temple")
    val temple: Int
)