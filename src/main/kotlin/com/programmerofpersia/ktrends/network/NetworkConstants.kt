package com.programmerofpersia.ktrends.network

object NetworkConstants {

    val BASE_TRENDS_URL = "https://trends.google.com/trends"
    val GENERAL_URL = "$BASE_TRENDS_URL/api/explore"
    val AUTO_COMPLETE_URL = "$BASE_TRENDS_URL/api/autocomplete"
    val DAILY_TRENDS = "$BASE_TRENDS_URL/api/dailytrends"
    val REAL_TIME_TRENDS = "$BASE_TRENDS_URL/api/realtimetrends"

    val USER_AGENT =
        "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.5481.77 Safari/537.36"

}