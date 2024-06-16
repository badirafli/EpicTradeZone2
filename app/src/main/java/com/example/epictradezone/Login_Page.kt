package com.example.epictradezone

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.epictradezone.databinding.LoginPageBinding
import com.google.firebase.auth.FirebaseAuth

class Login_Page : AppCompatActivity() {
    private lateinit var binding: LoginPageBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize Firebase Auth
        auth = FirebaseAuth.getInstance()

        val signup = findViewById<Button>(R.id.signup)
        signup.setOnClickListener {
            val intent = Intent(this, Signup_Page::class.java)
            startActivity(intent)
        }

        val signin = findViewById<Button>(R.id.signin)
        signin.setOnClickListener {
            val email = findViewById<EditText>(R.id.username).text.toString()
            val password = findViewById<EditText>(R.id.passwordlogin).text.toString()

            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        val intent = Intent(this, Home_Page::class.java)
                        startActivity(intent)
                        finish()
                    } else {
                        Toast.makeText(this, "Wrong Password.", Toast.LENGTH_SHORT).show()
                    }
                }
        }
    }
}
