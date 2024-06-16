package com.example.epictradezone

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Review_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.review_page)
        val beli = findViewById<ImageView>(R.id.beli)
        beli.setOnClickListener{
            val intent = Intent(this,Pay1_Page::class.java)
            startActivity(intent)
        }
    }
}