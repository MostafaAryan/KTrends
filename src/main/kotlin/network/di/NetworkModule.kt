package network.di

import dagger.Module
import dagger.Provides
import network.NetworkConstants
import network.UserAgentInterceptor
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun getOkHttpClient(): OkHttpClient {
        val userAgentInterceptor = UserAgentInterceptor(NetworkConstants.USER_AGENT)
        return OkHttpClient().newBuilder().addNetworkInterceptor(userAgentInterceptor).build()
    }

}