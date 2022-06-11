package com.example.splash3activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var tilUsername: TextInputLayout
    lateinit var etUsername: TextInputEditText
    lateinit var tilPassword: TextInputLayout
    lateinit var etPassword: TextInputEditText
    lateinit var btnlogin: Button
    lateinit var tilConfirmPassword:TextInputLayout
    lateinit var etConfrim:TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        castViews()
    }


    fun castViews() {
        tilUsername = findViewById(R.id.tilUsername)
        etUsername = findViewById(R.id.etUsername)
        tilPassword = findViewById(R.id.tilPassword)
        etPassword = findViewById(R.id.etPassword)
        btnlogin = findViewById(R.id.btnlogin)
        tilConfirmPassword=findViewById(R.id.tilConfirmPassword)
        etConfrim=findViewById(R.id.etConfrim)
        btnlogin.setOnClickListener {
            validate()
        }
    }

    fun validate() {
        var error=false
        tilUsername.error=null
        tilPassword.error=null
        tilConfirmPassword.error=null
        var Username = etUsername.text.toString()
        if (Username.isBlank()) {
            tilUsername.error = "username is required"
        }
        var Password = etPassword.text.toString()
        if (Password.isBlank()) {
            tilPassword.error = "Password is required"

        }
        var ConfirmPassword = etConfrim.text.toString()
        if (ConfirmPassword.isBlank()) {
            tilConfirmPassword.error = "Confirm Password is required"

        }
        if (Password!=ConfirmPassword)
        tilConfirmPassword.error="Password do not match"

    }
}