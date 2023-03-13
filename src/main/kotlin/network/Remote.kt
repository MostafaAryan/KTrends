package network

import data.response.JResAutoComplete
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

    private fun autoCompleteURL(searchKeyword: String) =
        "${NetworkConstants.AUTO_COMPLETE_URL}/$searchKeyword"

    fun dailyTrends(location: String = "US") =
        "${NetworkConstants.DAILY_TRENDS}?hl=en-US&tz=-210&geo=${location}&hl=en-US&ns=15"

    fun realtimeTrends(location: String = "US", category: String = "all") =
        "${NetworkConstants.REAL_TIME_TRENDS}?hl=en-US&tz=-210&cat=${category}&fi=0&fs=0&geo=${location}&ri=300&rs=20&sort=0"


}