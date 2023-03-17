import data.response.JResAutoComplete
import network.NetworkResult
import network.Remote
import kotlin.concurrent.thread

fun main(args: Array<String>) {

    Remote().requestAutoComplete("the last of us",object : NetworkResult<JResAutoComplete> {

        override fun onSuccess(t: JResAutoComplete) {
            val autoCompleteTopicTitles = t.default.topics.map {
                it.title
            }
            print("********")
            print(autoCompleteTopicTitles.toString())
        }

        override fun onFailure(errorMessage: String) {

        }

    })


}