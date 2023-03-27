package com.programmerofpersia.ktrends

import com.programmerofpersia.ktrends.data.response.JResRealtimeTrends
import com.programmerofpersia.ktrends.network.NetworkResult
import com.programmerofpersia.ktrends.network.di.DaggerNetworkComponents
import kotlin.concurrent.thread

fun main(args: Array<String>) {

    ////

    val api = DaggerNetworkComponents.create().getApi()
    api.requestRealtimeTrends(object : NetworkResult<JResRealtimeTrends> {
        override fun onSuccess(t: JResRealtimeTrends) {
            val titles = t.storySummaries.trendingStories.map {
                it.title
            }
            print("********")
            print(titles.toString())

            thread {

            }
        }

        override fun onFailure(errorMessage: String) {

        }

    })

    /*Remote().requestAutoComplete("the last of us", object : NetworkResult<JResAutoComplete> {

        override fun onSuccess(t: JResAutoComplete) {
            val autoCompleteTopicTitles = t.default.topics.map {
                it.title
            }
            print("********")
            print(autoCompleteTopicTitles.toString())
        }

        override fun onFailure(errorMessage: String) {

        }

    })*/


}