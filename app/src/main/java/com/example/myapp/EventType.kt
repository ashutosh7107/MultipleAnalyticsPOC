package com.example.myapp

interface EventType {

    fun name(provider: ProviderType): String?

    fun parameters(provider: ProviderType): HashMap<String, Any>?
}