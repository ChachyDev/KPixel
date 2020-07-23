package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Player(
    @SerializedName("body_armor_cost")
    val bodyArmorCost: Int,
    @SerializedName("bounty_hunter")
    val bountyHunter: Int,
    @SerializedName("pocket_change")
    val pocketChange: Int,
    @SerializedName("strength_training")
    val strengthTraining: Int
)