package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class PitStatsPtl(
    @SerializedName("arrow_hits")
    val arrowHits: Int,
    @SerializedName("arrows_fired")
    val arrowsFired: Int,
    @SerializedName("assists")
    val assists: Int,
    @SerializedName("blocks_placed")
    val blocksPlaced: Int,
    @SerializedName("bow_damage_dealt")
    val bowDamageDealt: Int,
    @SerializedName("bow_damage_received")
    val bowDamageReceived: Int,
    @SerializedName("cash_earned")
    val cashEarned: Int,
    @SerializedName("chat_messages")
    val chatMessages: Int,
    @SerializedName("contracts_started")
    val contractsStarted: Int,
    @SerializedName("damage_dealt")
    val damageDealt: Int,
    @SerializedName("damage_received")
    val damageReceived: Int,
    @SerializedName("dark_pants_crated")
    val darkPantsCrated: Int,
    @SerializedName("dark_pants_t2")
    val darkPantsT2: Int,
    @SerializedName("deaths")
    val deaths: Int,
    @SerializedName("diamond_items_purchased")
    val diamondItemsPurchased: Int,
    @SerializedName("enchanted_tier1")
    val enchantedTier1: Int,
    @SerializedName("enchanted_tier2")
    val enchantedTier2: Int,
    @SerializedName("enchanted_tier3")
    val enchantedTier3: Int,
    @SerializedName("enderchest_opened")
    val enderchestOpened: Int,
    @SerializedName("fished_anything")
    val fishedAnything: Int,
    @SerializedName("fishes_fished")
    val fishesFished: Int,
    @SerializedName("fishing_rod_launched")
    val fishingRodLaunched: Int,
    @SerializedName("gapple_eaten")
    val gappleEaten: Int,
    @SerializedName("ghead_eaten")
    val gheadEaten: Int,
    @SerializedName("gold_from_farming")
    val goldFromFarming: Int,
    @SerializedName("gold_from_selling_fish")
    val goldFromSellingFish: Int,
    @SerializedName("hidden_jewel_triggers")
    val hiddenJewelTriggers: Int,
    @SerializedName("joins")
    val joins: Int,
    @SerializedName("jumped_into_pit")
    val jumpedIntoPit: Int,
    @SerializedName("kills")
    val kills: Int,
    @SerializedName("king_quest_completion")
    val kingQuestCompletion: Int,
    @SerializedName("launched_by_launchers")
    val launchedByLaunchers: Int,
    @SerializedName("lava_bucket_emptied")
    val lavaBucketEmptied: Int,
    @SerializedName("left_clicks")
    val leftClicks: Int,
    @SerializedName("max_streak")
    val maxStreak: Int,
    @SerializedName("melee_damage_received")
    val meleeDamageReceived: Int,
    @SerializedName("night_quests_completed")
    val nightQuestsCompleted: Int,
    @SerializedName("playtime_minutes")
    val playtimeMinutes: Int,
    @SerializedName("sewer_treasures_found")
    val sewerTreasuresFound: Int,
    @SerializedName("soups_drank")
    val soupsDrank: Int,
    @SerializedName("sword_hits")
    val swordHits: Int,
    @SerializedName("wheat_farmed")
    val wheatFarmed: Int
)