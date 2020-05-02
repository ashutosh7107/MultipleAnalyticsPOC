package com.example.myapp.interfaces

interface AnalyticsType<T> {

    fun log(event : T)

    fun register(provider: ProviderType)
}