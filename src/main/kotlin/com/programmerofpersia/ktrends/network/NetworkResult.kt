package com.programmerofpersia.ktrends.network

interface NetworkResult<T> {

    fun onSuccess(t: T)

    fun onFailure(errorMessage: String)

}