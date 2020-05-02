package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapp.provider.FirebaseProvider
import kotlinx.android.synthetic.main.activity_analytics.*

class AnalyticsActivity : AppCompatActivity() {

    val analytics = Raincoat<MyEvent>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_analytics)

        analytics.register(FirebaseProvider(this))
        //analytics.register(LocalyticsProvider(this, ))

        btn1.setOnClickListener(View.OnClickListener {
            val intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        })
    }
}
