package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class ResourcesCollected(
    @SerializedName("diamond")
    val diamond: Int,
    @SerializedName("emerald")
    val emerald: Int,
    @SerializedName("gold")
    val gold: Int,
    @SerializedName("iron")
    val iron: Int
)