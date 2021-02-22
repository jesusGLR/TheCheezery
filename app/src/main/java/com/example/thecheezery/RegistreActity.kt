package com.example.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistreActity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registre_actity)
val button: Button= findViewById(R.id.sign_in_button) as Button
        button.setOnClickListener {
            var intent: Intent= Intent(this,RegistreActity::class.java)
            startActivity(intent)
        }
    }
}