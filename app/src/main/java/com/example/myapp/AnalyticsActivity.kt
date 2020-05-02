package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapp.provider.FirebaseProvider

class AnalyticsActivity : AppCompatActivity() {

    val analytics = Raincoat<MyEvent>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        analytics.register(FirebaseProvider(this))
        //analytics.register(LocalyticsProvider(this, ))
    }
}
