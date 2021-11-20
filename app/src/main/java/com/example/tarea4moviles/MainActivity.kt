package com.example.tarea4moviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        abrir()
    }
    fun abrir(){
        val hilo = Thread(Runnable{
            Thread.sleep(5000)
            val intent = Intent(this, Loggin::class.java)
            startActivity(intent)}).start()
    }
}