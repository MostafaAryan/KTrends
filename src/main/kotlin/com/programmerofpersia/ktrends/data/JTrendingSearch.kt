package com.programmerofpersia.ktrends.data

import kotlinx.serialization.Serializable

@Serializable
data class JTrendingSearch(
    val title: JTitle,
    val formattedTraffic: String,
    // val relatedQueries: String,
    val image: JImage,
    val articles: List<JArticle>,
    val shareUrl: String,
) {

    @Serializable
    data class JTitle(
        val query: String,
        val exploreLink: String,
    )

}