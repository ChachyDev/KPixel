package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Profile(
    @SerializedName("apollo_enabled")
    val apolloEnabled: Boolean,
    @SerializedName("bounties")
    val bounties: List<Bounty>,
    @SerializedName("cash")
    val cash: Int,
    @SerializedName("cash_during_prestige_0")
    val cashDuringPrestige0: Int,
    @SerializedName("cash_during_prestige_1")
    val cashDuringPrestige1: Int,
    @SerializedName("chat_option_bounties")
    val chatOptionBounties: Boolean,
    @SerializedName("chat_option_kill_feed")
    val chatOptionKillFeed: Boolean,
    @SerializedName("chat_option_misc")
    val chatOptionMisc: Boolean,
    @SerializedName("chat_option_player_chat")
    val chatOptionPlayerChat: Boolean,
    @SerializedName("chat_option_prestige_announcements")
    val chatOptionPrestigeAnnouncements: Boolean,
    @SerializedName("chat_option_streaks")
    val chatOptionStreaks: Boolean,
    @SerializedName("contract_choices")
    val contractChoices: List<Any>,
    @SerializedName("death_recaps")
    val deathRecaps: DeathRecaps,
    @SerializedName("drop_confirm_disabled")
    val dropConfirmDisabled: Boolean,
    @SerializedName("ended_contracts")
    val endedContracts: List<EndedContract>,
    @SerializedName("genesis_allegiance")
    val genesisAllegiance: String,
    @SerializedName("genesis_allegiance_time")
    val genesisAllegianceTime: Int,
    @SerializedName("genesis_points")
    val genesisPoints: Int,
    @SerializedName("genesis_spawn_in_base")
    val genesisSpawnInBase: Boolean,
    @SerializedName("genesis_weekly_perks_claim_item_demon")
    val genesisWeeklyPerksClaimItemDemon: Int,
    @SerializedName("gold_transactions")
    val goldTransactions: List<GoldTransaction>,
    @SerializedName("hat_color")
    val hatColor: Int,
    @SerializedName("hat_enabled")
    val hatEnabled: Boolean,
    @SerializedName("hotbar_favorites")
    val hotbarFavorites: List<Int>,
    @SerializedName("impatient_enabled")
    val impatientEnabled: Boolean,
    @SerializedName("inv_armor")
    val invArmor: InvArmor,
    @SerializedName("inv_contents")
    val invContents: InvContents,
    @SerializedName("inv_enderchest")
    val invEnderchest: InvEnderchest,
    @SerializedName("item_stash")
    val itemStash: ItemStash,
    @SerializedName("last_contract")
    val lastContract: Int,
    @SerializedName("last_lycanthropy")
    val lastLycanthropy: Int,
    @SerializedName("last_midfight_disconnect")
    val lastMidfightDisconnect: Int,
    @SerializedName("last_save")
    val lastSave: Int,
    @SerializedName("leaderboard_stats")
    val leaderboardStats: LeaderboardStats,
    @SerializedName("login_messages")
    val loginMessages: List<Any>,
    @SerializedName("mystic_well_item")
    val mysticWellItem: MysticWellItem,
    @SerializedName("mystic_well_pants")
    val mysticWellPants: MysticWellPants,
    @SerializedName("night_quests_enabled")
    val nightQuestsEnabled: Boolean,
    @SerializedName("outgoing_offers")
    val outgoingOffers: List<Any>,
    @SerializedName("prestiges")
    val prestiges: List<Prestige>,
    @SerializedName("recent_kills")
    val recentKills: List<RecentKill>,
    @SerializedName("reconessence_day")
    val reconessenceDay: Int,
    @SerializedName("renown")
    val renown: Int,
    @SerializedName("renown_unlocks")
    val renownUnlocks: List<RenownUnlock>,
    @SerializedName("selected_launch_trail")
    val selectedLaunchTrail: String,
    @SerializedName("selected_leaderboard")
    val selectedLeaderboard: String,
    @SerializedName("selected_perk_0")
    val selectedPerk0: String,
    @SerializedName("selected_perk_1")
    val selectedPerk1: String,
    @SerializedName("selected_perk_2")
    val selectedPerk2: String,
    @SerializedName("selected_perk_3")
    val selectedPerk3: String,
    @SerializedName("trade_timestamps")
    val tradeTimestamps: List<Int>,
    @SerializedName("unlocks")
    val unlocks: List<Unlock>,
    @SerializedName("unlocks_1")
    val unlocks1: List<Unlocks1>,
    @SerializedName("xp")
    val xp: Int,
    @SerializedName("zero_point_three_gold_transfer")
    val zeroPointThreeGoldTransfer: Boolean,
    @SerializedName("zero_point_two_xp")
    val zeroPointTwoXp: Int
)