package com.programmerofpersia.ktrends.data.response

import com.programmerofpersia.ktrends.data.JTrendingSearchDay
import kotlinx.serialization.Serializable

@Serializable
data class JResDailyTrends(
    val default: JDefaultDailyTrends,
) {


}

@Serializable
data class JDefaultDailyTrends(
    val trendingSearchesDays: List<JTrendingSearchDay>,
    val endDateForNextRequest: String,
    val rssFeedPageUrl: String,

    )