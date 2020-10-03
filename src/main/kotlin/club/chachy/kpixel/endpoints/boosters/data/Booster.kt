package club.chachy.kpixel.endpoints.boosters.data

import com.google.gson.annotations.SerializedName

data class Booster(
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("multiplier")
    val multiplier: Number,
    @SerializedName("activated")
    val activated: Long,
    @SerializedName("originalLength")
    val originalLength: Int,
    @SerializedName("length")
    val length: Int,
    @SerializedName("active")
    val active: Boolean,
    @SerializedName("stacked")
    val stacked: ArrayList<String>

)
