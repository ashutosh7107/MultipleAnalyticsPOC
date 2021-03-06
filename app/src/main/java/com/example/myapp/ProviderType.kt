package com.example.myapp

import java.lang.reflect.Method

interface ProviderType {

    var classFunction: Method

    var classInstance: Method?

    var className: Class<*>

    fun log(eventName: String, parameters: HashMap<String, Any>?)
}