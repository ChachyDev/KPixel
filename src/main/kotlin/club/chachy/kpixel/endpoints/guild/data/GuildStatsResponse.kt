package club.chachy.kpixel.endpoints.guild.data


import com.google.gson.annotations.SerializedName

data class GuildStatsResponse(
    @SerializedName("created")
    val created: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("exp")
    val exp: Int,
    @SerializedName("exp_by_game")
    val expByGame: Int,
    @SerializedName("exp_history")
    val expHistory: ExpHistory,
    @SerializedName("id")
    val id: String,
    @SerializedName("legacy_ranking")
    val legacyRanking: Int,
    @SerializedName("level")
    val level: Int,
    @SerializedName("members")
    val members: List<Member>,
    @SerializedName("name")
    val name: String,
    @SerializedName("preferred_games")
    val preferredGames: List<String>,
    @SerializedName("ranks")
    val ranks: List<Rank>,
    @SerializedName("tag")
    val tag: String,
    @SerializedName("tag_color")
    val tagColor: String,
    @SerializedName("tag_formatted")
    val tagFormatted: String
)