package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class CombatLevels(
    @SerializedName("cooldown")
    val cooldown: Int,
    @SerializedName("energy")
    val energy: Int,
    @SerializedName("health")
    val health: Int,
    @SerializedName("melee")
    val melee: Int
)