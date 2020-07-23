package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class RenownUnlock(
    @SerializedName("acquireDate")
    val acquireDate: Int,
    @SerializedName("key")
    val key: String,
    @SerializedName("tier")
    val tier: Int
)