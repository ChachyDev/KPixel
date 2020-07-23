package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class EndedContract(
    @SerializedName("chunk_of_viles_reward")
    val chunkOfVilesReward: Int,
    @SerializedName("completion_date")
    val completionDate: Int,
    @SerializedName("difficulty")
    val difficulty: String,
    @SerializedName("gold_reward")
    val goldReward: Int,
    @SerializedName("key")
    val key: String,
    @SerializedName("progress")
    val progress: Progress,
    @SerializedName("remaining_ticks")
    val remainingTicks: Int,
    @SerializedName("requirements")
    val requirements: Requirements
)