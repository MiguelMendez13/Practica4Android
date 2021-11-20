package com.example.tarea4moviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class Loggin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loggin)
        val boton = findViewById<Button>(R.id.bton)
        val contra = findViewById<EditText>(R.id.password_input)


        boton.setOnClickListener {
            println(contra.text.toString())
            if (contra.text.toString() == "Android2021") {

                val intent = Intent(this, Entrada::class.java)
                startActivity(intent)
            }
        }
    }
}