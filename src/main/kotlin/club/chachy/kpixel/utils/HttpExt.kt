package club.chachy.kpixel.utils

import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.client.features.json.GsonSerializer
import io.ktor.client.features.json.Json
import io.ktor.client.request.get
import io.ktor.client.request.parameter

val http = HttpClient(Apache) {
    Json {
        serializer = GsonSerializer {
            serializeNulls()
            disableHtmlEscaping()
        }
    }
}

suspend inline fun <reified T> HttpClient.getSlothpixelRoute(path: String, token: String?) = get<T>("https://api.slothpixel.me/api$path") {
    token?.takeIf { it.isNotEmpty() }?.let { parameter("key", it) }
}