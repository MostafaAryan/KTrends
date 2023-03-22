package com.programmerofpersia.ktrends.network

import com.programmerofpersia.ktrends.data.response.JResAutoComplete
import com.programmerofpersia.ktrends.data.response.JResDailyTrends
import com.programmerofpersia.ktrends.data.response.JResRealtimeTrends
import org.junit.Before
import org.junit.Test
import org.mockito.kotlin.any
import org.mockito.kotlin.eq
import org.mockito.kotlin.mock
import org.mockito.kotlin.verify

class ApiUnitTest {

    lateinit var networkRequest: NetworkRequest
    lateinit var api: Api

    @Before
    fun setup() {
        networkRequest = mock()
        api = Api(networkRequest)
    }

    @Test
    fun whenAutoCompleteApiCalled_AutoCompleteShouldBeRequestedFromNetworkRequest() {
        val searchKeyword = "The Last of Us"
        val networkResult = mock<NetworkResult<JResAutoComplete>>()
        api.requestAutoComplete(searchKeyword, networkResult)

        verify(networkRequest).request(
            any(),
            eq(networkResult),
            eq(JResAutoComplete.serializer()),
            eq(")]}',")
        )
    }

    @Test
    fun whenDailyTrendsApiCalled_DailyTrendsShouldBeRequestedFromNetworkRequest() {
        val networkResult = mock<NetworkResult<JResDailyTrends>>()
        api.requestDailyTrends(networkResult)

        verify(networkRequest).request(
            any(),
            eq(networkResult),
            eq(JResDailyTrends.serializer()),
            eq(")]}',")
        )
    }

    @Test
    fun whenRealtimeTrendsApiCalled_RealtimeTrendsShouldBeRequestedFromNetworkRequest() {
        val networkResult = mock<NetworkResult<JResRealtimeTrends>>()
        api.requestRealtimeTrends(networkResult)

        verify(networkRequest).request(
            any(),
            eq(networkResult),
            eq(JResRealtimeTrends.serializer()),
            eq(")]}'")
        )
    }


}