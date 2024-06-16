package com.example.epictradezone

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Home_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page)
        val review = findViewById<ImageView>(R.id.review)
        review.setOnClickListener{
            val intent = Intent(this,Review_Page::class.java)
            startActivity(intent)
        }
    }
}