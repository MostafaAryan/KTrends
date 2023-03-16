package data

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class JArticle(
    @JsonNames("articleTitle")
    val title: String,
    @JsonNames("time")
    val timeAgo: String,
    val image: JImage? = null,
    val url: String,
    val source: String? = null,
    val snippet: String,
)

