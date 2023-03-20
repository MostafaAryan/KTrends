package com.programmerofpersia.ktrends.network.di

import com.programmerofpersia.ktrends.network.Api
import dagger.Component
import com.programmerofpersia.ktrends.network.NetworkRequest
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface NetworkComponents {

    fun getNetworkRequest(): NetworkRequest

    fun getApi() : Api

}