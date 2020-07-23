package club.chachy.kpixel.endpoints.player.data.quests


import com.google.gson.annotations.SerializedName

data class Completions(
    @SerializedName("game")
    val game: List<Int>
)