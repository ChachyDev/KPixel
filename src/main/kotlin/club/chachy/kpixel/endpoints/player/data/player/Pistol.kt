package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Pistol(
    @SerializedName("damage_increase")
    val damageIncrease: Int,
    @SerializedName("recoil_reduction")
    val recoilReduction: Int,
    @SerializedName("reload_speed_reduction")
    val reloadSpeedReduction: Int
)