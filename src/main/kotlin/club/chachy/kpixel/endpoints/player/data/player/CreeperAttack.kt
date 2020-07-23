package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class CreeperAttack(
    @SerializedName("best_wave")
    val bestWave: Int
)