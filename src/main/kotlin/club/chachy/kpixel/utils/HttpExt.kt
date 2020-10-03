package club.chachy.kpixel.utils

import io.ktor.client.*
import io.ktor.client.engine.apache.*
import io.ktor.client.features.json.*
import io.ktor.client.request.*

val http = HttpClient(Apache) {
    Json {
        serializer = GsonSerializer {
            serializeNulls()
            disableHtmlEscaping()
        }
    }
}

suspend inline fun <reified T> HttpClient.getSlothpixelRoute(path: String, token: String?) =
    get<T>("https://api.slothpixel.me/api$path") {
        token?.takeIf { it.isNotEmpty() }?.let { parameter("key", it) }
    }