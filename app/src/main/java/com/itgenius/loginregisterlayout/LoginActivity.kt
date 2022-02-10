package com.itgenius.loginregisterlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnPassword = findViewById<Button>(R.id.btnPassword)
        val btnSignup = findViewById<Button>(R.id.btnSignup)

        btnPassword.setOnClickListener {
            // Toast.makeText(this, "Clicked btnPassword", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ForgotPassActivity::class.java)
            startActivity(intent)
        }

        btnSignup.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}