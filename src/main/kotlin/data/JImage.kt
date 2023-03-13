package data

import kotlinx.serialization.Serializable

@Serializable
data class JImage(
    val newsUrl: String,
    val source: String,
    val imageUrl: String,
) {
}