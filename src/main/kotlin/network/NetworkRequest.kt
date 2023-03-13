package network

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.json.Json
import okhttp3.*
import okio.IOException
import javax.inject.Inject

class NetworkRequest @Inject constructor(private val client: OkHttpClient) {


    fun <T> request(
        url: String,
        networkResult: NetworkResult<T>,
        deserializationStrategy: DeserializationStrategy<T>,
        initialCharsToRemoveFromResponse: String? = null
    ) {
        val request = Request.Builder().url(url).build()
        val responseCallback = object : Callback {
            override fun onFailure(call: Call, e: java.io.IOException) {
                println("failure!")
                networkResult.onFailure(e.message ?: "failure!")
            }

            override fun onResponse(call: Call, response: Response) {
                print("success.")
                var bodyString = response.body?.string()
                initialCharsToRemoveFromResponse?.let {charsToBeRemoved ->
                    bodyString = bodyString?.replace(charsToBeRemoved, "")
                }
                print(bodyString)

                val resultObject = Json.decodeFromString(deserializationStrategy, bodyString ?: "")
                networkResult.onSuccess(resultObject)
            }
        }

        try {
            client.newCall(request).enqueue(responseCallback)
        } catch (e: IOException) {
            e.printStackTrace()
        }

    }

}