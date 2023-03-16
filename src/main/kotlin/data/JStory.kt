package data

import kotlinx.serialization.Serializable

/**
 *  @param title Is the entityNames, concatenated together.
 * */
@Serializable
data class JStory(
    val id: String,
    val title: String,
    val entityNames: List<String>,
    val image: JImage,
    val shareUrl: String,
    val articles: List<JArticle>,
    val idsForDedup: List<String>,

    ) {


}