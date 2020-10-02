package club.chachy.kpixel.endpoints.guild.data


import com.google.gson.annotations.SerializedName

data class Rank(
    @SerializedName("created")
    val created: Int,
    @SerializedName("default")
    val default: Boolean,
    @SerializedName("name")
    val name: String,
    @SerializedName("permissions")
    val permissions: List<Int>,
    @SerializedName("priority")
    val priority: Int,
    @SerializedName("tag")
    val tag: String
)