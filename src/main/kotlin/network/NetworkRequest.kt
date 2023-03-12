package network

import okhttp3.*
import okio.IOException
import javax.inject.Inject

class NetworkRequest @Inject constructor(private val client: OkHttpClient) {


    fun <T> request(url: String, networkResult: NetworkResult<T>) {
        val request = Request.Builder().url(url).build()
        val responseCallback = object : Callback {
            override fun onFailure(call: Call, e: java.io.IOException) {
                println("failure")
                // networkResult.onSuccess(result.onFailure("message"))
            }

            override fun onResponse(call: Call, response: Response) {
                print("success")
                print(response.body?.string() ?: "")
                // networkResult.onSuccess(response.body?.string() ?: "")
            }
        }

        try {
            client.newCall(request).enqueue(responseCallback)
        } catch (e: IOException) {
            e.printStackTrace()
        }

    }

}