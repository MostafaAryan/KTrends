package network

import data.response.JResAutoComplete
import data.response.JResDailyTrends
import data.response.JResRealtimeTrends
import network.di.DaggerEndpointComponents

class Remote {

    fun requestAutoComplete(searchKeyword: String, result: NetworkResult<JResAutoComplete>) {
        val networkRequest = DaggerEndpointComponents.create().getNetworkRequest()
        networkRequest.request(
            autoCompleteURL(searchKeyword),
            result,
            JResAutoComplete.serializer(),
            ")]}',"
        )
    }

    fun requestDailyTrends(result: NetworkResult<JResDailyTrends>) {
        val networkRequest = DaggerEndpointComponents.create().getNetworkRequest()
        networkRequest.request(
            dailyTrendsURL(),
            result,
            JResDailyTrends.serializer(),
            ")]}',"
        )
    }

    fun requestRealtimeTrends(result: NetworkResult<JResRealtimeTrends>) {
        val networkRequest = DaggerEndpointComponents.create().getNetworkRequest()
        networkRequest.request(
            realtimeTrendsURL(),
            result,
            JResRealtimeTrends.serializer(),
            ")]}'"
        )
    }

    private fun autoCompleteURL(searchKeyword: String) =
        "${NetworkConstants.AUTO_COMPLETE_URL}/$searchKeyword"

    private fun dailyTrendsURL(location: String = "US") =
        "${NetworkConstants.DAILY_TRENDS}?hl=en-US&tz=-210&geo=${location}&hl=en-US&ns=15"

    private fun realtimeTrendsURL(location: String = "US", category: String = "all") =
        "${NetworkConstants.REAL_TIME_TRENDS}?hl=en-US&tz=-210&cat=${category}&fi=0&fs=0&geo=${location}&ri=300&rs=20&sort=0"


}