package com.example.myapp.provider

import android.content.Context
import android.content.Intent
import android.util.Log
import com.example.myapp.ProviderType
import java.lang.reflect.Method

class LocalyticsProvider(private val context: Context, private val intent: Intent) : ProviderType {

    override var className = Class.forName("com.localytics.android.Localytics")
    override var classInstance: Method? = className.getDeclaredMethod("onNewIntent", Context::class.java, Intent::class.java)
    override var classFunction = className.getDeclaredMethod("tagEvent", String::class.java, HashMap::class.java)

    init {
        classInstance?.let {
            // get context
            try {
                it.invoke(className, context, intent)
            } catch (e: Exception) {
                Log.e("Raincoat", e.localizedMessage)
            }
        }
    }

    override fun log(eventName: String, parameters: HashMap<String, Any>?) {
        try {
            classFunction.invoke(classInstance, eventName, parameters)
        } catch (e: Exception) {
            Log.e("Raincoat", e.localizedMessage)
        }
    }
}