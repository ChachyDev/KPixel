package club.chachy.kpixel.endpoints.player.data.status


import com.google.gson.annotations.SerializedName

data class SlothpixelCurrentPlayerActivityResponse(
    @SerializedName("game")
    val game: Game,
    @SerializedName("online")
    val online: Boolean
)