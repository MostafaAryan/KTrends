package network.di

import dagger.Component
import network.NetworkRequest
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface EndpointComponents {

    fun getNetworkRequest(): NetworkRequest

}