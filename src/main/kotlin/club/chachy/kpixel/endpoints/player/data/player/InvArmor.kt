package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class InvArmor(
    @SerializedName("data")
    val `data`: List<Int>,
    @SerializedName("type")
    val type: Int
)