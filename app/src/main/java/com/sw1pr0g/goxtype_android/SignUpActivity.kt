package com.sw1pr0g.goxtype_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.math.log

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val onLogInTextClick = findViewById<TextView>(R.id.logInText)
        onLogInTextClick.setOnClickListener {
            val intent = Intent(this, LogInActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_left, R.anim.stay)
        }
        val onLogInArrowClick = findViewById<ImageView>(R.id.logInArrow)
        onLogInArrowClick.setOnClickListener {
            val intent = Intent(this, LogInActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_left, R.anim.stay)
        }

        val signUpButton = findViewById<Button>(R.id.signUpButton)
        signUpButton.setOnClickListener {
            addUser()
        }
    }

    private fun addUser() {

        var name: String = findViewById<EditText>(R.id.editTextName).text.toString()
        var email: String = findViewById<EditText>(R.id.editTextEmail).text.toString()
        var phone: String = findViewById<EditText>(R.id.editTextPhone).text.toString()
        var password: String = findViewById<EditText>(R.id.editTextPassword).text.toString()

        if (name.isNotEmpty() && email.isNotEmpty() && phone.isNotEmpty() && password.isNotEmpty())

            Toast.makeText(applicationContext, "Your credetinals - ${name}, ${email}, ${phone}, ${password}", Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(applicationContext, "Error! Fields empty!", Toast.LENGTH_SHORT).show()
    }

}