package example.com.company

import club.chachy.kpixel.KPixel
import club.chachy.kpixel.endpoints.boosters.data.Booster
import club.chachy.kpixel.endpoints.boosters.data.BoostersObject
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * @author Filip
 */

fun main() = runBlocking {
    launch {
        val boostersObject: BoostersObject = KPixel().boosters.getBoosters()
        println("Smash boosters are: ${boostersObject.boosters["Smash"]?.get(0)?.uuid}") // Gets the uuid of the smash booster at array position one
        println("Is boosters decrementing?: ${boostersObject.decrementing}")
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
    }

    coroutineScope {
        val boostersfromGame: ArrayList<Booster> = KPixel().boosters.getBoosters("Warlords")
        println("${boostersfromGame.size} users are boosting in Warlords")
        println("WarLord user: ${boostersfromGame[0].uuid}, Multiplier: ${boostersfromGame[0].multiplier}");
        delay(100L)
    }

    delay(1000L)
}

