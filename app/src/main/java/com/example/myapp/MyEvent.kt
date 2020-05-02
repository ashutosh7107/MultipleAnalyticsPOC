package com.example.myapp

sealed class MyEvent : EventType {

    class SignUp(username: String) : MyEvent()
    class Register(username: String, password: String) : MyEvent()

    override fun name(provider: ProviderType): String? {
        return when (this) {
            is SignUp -> "signUp"
            is Register -> "register"
        }
    }

    override fun parameters(provider: ProviderType): HashMap<String, Any>? {
        return when (this) {
            is SignUp -> {
                hashMapOf()
            }
            is Register -> {
                hashMapOf()
            }
        }
    }

}