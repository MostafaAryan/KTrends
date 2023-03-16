package data.response

import data.JStory
import kotlinx.serialization.Serializable

@Serializable
data class JResRealtimeTrends(
    val featuredStoryIds: List<String>,
    val trendingStoryIds: List<String>,
    val storySummaries: JStorySummaries,
    val date: String,
) {


}

@Serializable
data class JStorySummaries(
    val featuredStories: List<JStory>,
    val trendingStories: List<JStory>
)