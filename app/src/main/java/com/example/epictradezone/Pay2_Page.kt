package com.example.epictradezone

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Pay2_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pay2_page)
        val status = findViewById<ImageView>(R.id.status)
        status.setOnClickListener{
            val intent = Intent(this,Final_Page::class.java)
            startActivity(intent)
        }
    }
}