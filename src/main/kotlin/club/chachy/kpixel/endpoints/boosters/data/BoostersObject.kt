package club.chachy.kpixel.endpoints.boosters.data

import com.google.gson.annotations.SerializedName

data class BoostersObject(
    @SerializedName("boosters")
    val boosters: Map<String, List<Booster>>,
    @SerializedName("decrementing")
    val decrementing: Boolean
)