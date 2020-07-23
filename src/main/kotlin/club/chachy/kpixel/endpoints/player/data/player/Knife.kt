package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Knife(
    @SerializedName("attack_delay")
    val attackDelay: Int,
    @SerializedName("damage_increase")
    val damageIncrease: Int
)