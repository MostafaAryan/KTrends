package com.programmerofpersia.ktrends.data.response

import com.programmerofpersia.ktrends.data.JTopic
import kotlinx.serialization.Serializable

@Serializable
data class JResAutoComplete(
    val default: JDefault,
) {


}

@Serializable
data class JDefault(val topics: List<JTopic>)