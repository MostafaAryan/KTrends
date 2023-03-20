package com.programmerofpersia.ktrends.data

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class JImage(
    val newsUrl: String,
    val source: String,
    @JsonNames("imgUrl")
    val imageUrl: String,
) {
}