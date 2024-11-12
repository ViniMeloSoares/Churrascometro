package com.viniciusmelo.churrascmetro

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Result_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result_screen)

        val carne_result =intent.getIntExtra("Carne", 0)
        val linguiça_result = intent.getIntExtra("Linguiça",0)
        val cerveja_result = intent.getIntExtra("Cerveja", 0)
        val refrigerante_result = intent.getIntExtra("Refrigerante",0)






        }
    }
