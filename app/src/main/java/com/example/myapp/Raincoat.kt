package com.example.myapp

class Raincoat <T : EventType> : AnalyticsType<T> {

    private var providers = arrayListOf<ProviderType>()

    override fun register(provider: ProviderType) {
        this.providers.add(provider)
    }

    override fun log(event: T) {
        this.providers.forEach { provider ->
            event.name(provider)?.let { name ->
                val parameters = event.parameters(provider)
                provider.log(name, parameters)
            }
        }
    }
}
