package com.example.epictradezone

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Pay1_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pay1_page)
        val bca = findViewById<ImageView>(R.id.bca)
        bca.setOnClickListener{
            val intent = Intent(this,Pay2_Page::class.java)
            startActivity(intent)
        }
    }
}