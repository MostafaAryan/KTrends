package com.programmerofpersia.ktrends.data

import kotlinx.serialization.Serializable

@Serializable
data class JTopic(
    val mid: String,
    val title: String,
    val type: String
) {


}