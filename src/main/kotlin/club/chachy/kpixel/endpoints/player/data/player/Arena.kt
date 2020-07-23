package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Arena(
    @SerializedName("active_rune")
    val activeRune: String,
    @SerializedName("coins")
    val coins: Int,
    @SerializedName("coins_spent")
    val coinsSpent: Int,
    @SerializedName("combat_levels")
    val combatLevels: CombatLevels,
    @SerializedName("gamemodes")
    val gamemodes: Gamemodes,
    @SerializedName("hat")
    val hat: String,
    @SerializedName("keys")
    val keys: Int,
    @SerializedName("magical_chest")
    val magicalChest: Int,
    @SerializedName("penalty")
    val penalty: Int,
    @SerializedName("rune_levels")
    val runeLevels: RuneLevels,
    @SerializedName("selected_sword")
    val selectedSword: String,
    @SerializedName("skills")
    val skills: Skills
)