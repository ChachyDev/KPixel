package club.chachy.kpixel.endpoints.player.data.player


import com.google.gson.annotations.SerializedName

data class Pit(
    @SerializedName("pit_stats_ptl")
    val pitStatsPtl: PitStatsPtl,
    @SerializedName("profile")
    val profile: Profile,
    @SerializedName("restored_inv_backup_1")
    val restoredInvBackup1: Int,
    @SerializedName("stats_move_1")
    val statsMove1: Int
)