package com.example.epictradezone

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Final_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.final_page)
        val finish = findViewById<ImageView>(R.id.selesai)
        finish.setOnClickListener{
            val intent = Intent(this,Home_Page::class.java)
            startActivity(intent)
        }
    }
}