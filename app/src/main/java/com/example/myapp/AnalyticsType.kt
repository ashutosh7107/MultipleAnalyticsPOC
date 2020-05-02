package com.example.myapp

interface AnalyticsType<T> {

    fun log(event : T)

    fun register(provider: ProviderType)
}