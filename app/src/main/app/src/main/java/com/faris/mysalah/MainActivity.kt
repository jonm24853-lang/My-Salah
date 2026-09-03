package com.faris.mysalah

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val title = TextView(this).apply {
            text = "🕌 My Salah"
            textSize = 30f
            setPadding(40, 80, 40, 40)
        }

        setContentView(title)
    }
}
