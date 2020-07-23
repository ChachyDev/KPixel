package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Settings(
    @SerializedName("auto_armor")
    val autoArmor: Boolean,
    @SerializedName("default_kit")
    val defaultKit: String
)