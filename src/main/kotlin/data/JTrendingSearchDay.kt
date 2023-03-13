package data

import kotlinx.serialization.Serializable

@Serializable
data class JTrendingSearchDay(
    val date : String,
    val formattedDate : String,
    val trendingSearches : List<JTrendingSearch>,
    ) {
}