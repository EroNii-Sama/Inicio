package com.moviles.tarea1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class SegundoActivity : AppCompatActivity() {
    private lateinit var lblUser : TextView
    private lateinit var lblPassword : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segundo)
        lblUser = findViewById(R.id.textUser)
        lblPassword = findViewById(R.id.textPassword)

        setupListener()
    }

    private fun setupListener() {
        val username = intent.getStringExtra("username")
        val password = intent.getStringExtra("password")
        Toast.makeText(this@SegundoActivity, username, Toast.LENGTH_SHORT).show()
        Toast.makeText(this@SegundoActivity, password, Toast.LENGTH_SHORT).show()
        println("$username $password")
        if(username != "") {
            lblUser.text = "Bienvenido $username"
        } else {
            lblUser.text = "Ingrese un usuario en la pantalla anterior"
        }
        if(password != "") {
            lblPassword.text = "Contraseña: $password"
        } else {
            lblPassword.text = "Ingrese una contraseña en la pantalla anterior"
        }
    }
}