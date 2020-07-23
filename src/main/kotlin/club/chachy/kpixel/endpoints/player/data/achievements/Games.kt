package club.chachy.kpixel.endpoints.player.data.achievements


import com.google.gson.annotations.SerializedName

data class Games(
    @SerializedName("completed")
    val completed: Int,
    @SerializedName("completed_one_time")
    val completedOneTime: Int,
    @SerializedName("completed_tiered")
    val completedTiered: Int,
    @SerializedName("one_time")
    val oneTime: List<String>,
    @SerializedName("points")
    val points: Int,
    @SerializedName("points_one_time")
    val pointsOneTime: Int,
    @SerializedName("points_tiered")
    val pointsTiered: Int,
    @SerializedName("tiered")
    val tiered: List<Int>
)