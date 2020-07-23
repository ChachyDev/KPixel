package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Gamemodes(
    @SerializedName("four_v_four")
    val fourVFour: FourVFour,
    @SerializedName("one_v_one")
    val oneVOne: OneVOne,
    @SerializedName("two_v_two")
    val twoVTwo: TwoVTwo
)