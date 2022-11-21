package com.moviles.tarea1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var txtUser : EditText
    private lateinit var txtPassword : EditText
    private lateinit var btnInicio : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtUser = findViewById(R.id.txtUser)
        txtPassword = findViewById(R.id.txtPassword)
        btnInicio= findViewById(R.id.btnInicio)
        setupListener()
    }

    private fun setupListener() {
        btnInicio.setOnClickListener {
            val intent = Intent(this, SegundoActivity::class.java)
            intent.putExtra("username", txtUser.text.toString())
            intent.putExtra("password", txtPassword.text.toString())
            startActivity(intent)
        }
    }
}