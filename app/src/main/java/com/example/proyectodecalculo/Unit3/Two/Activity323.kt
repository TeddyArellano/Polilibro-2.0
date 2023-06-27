package com.example.proyectodecalculo.Unit3.Two

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.proyectodecalculo.R
import com.example.proyectodecalculo.Unit3Activity

class Activity323 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_323)

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, Unit3Activity::class.java)
            startActivity(intent)
        }
    }
}