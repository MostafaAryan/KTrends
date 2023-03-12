
import network.NetworkResult
import network.Endpoint
import network.di.DaggerEndpointComponents

fun main(args: Array<String>) {

    val networkResult = object : NetworkResult<Any> {

        override fun onSuccess(t: Any) {

        }

        override fun onFailure(errorMessage: String) {

        }

    }

    val networkRequest = DaggerEndpointComponents.create().getNetworkRequest()
    networkRequest.request(
        Endpoint().realtimeTrends(),
        networkResult
    )


}