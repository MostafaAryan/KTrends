package data.response

import data.JTopic
import kotlinx.serialization.Serializable

@Serializable
data class JResAutoComplete(
    val default: JDefault,
) {


}

@Serializable
data class JDefault(val topics: List<JTopic>)