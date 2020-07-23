package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class RuneLevels(
    @SerializedName("damage")
    val damage: Int,
    @SerializedName("energy")
    val energy: Int,
    @SerializedName("slowing")
    val slowing: Int,
    @SerializedName("speed")
    val speed: Int
)