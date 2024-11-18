package com.viniciusmelo.churrascmetro

import android.icu.text.DecimalFormat
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Result_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result_screen)

        val carne_result =intent.getDoubleExtra("Carne", 0.0)
        val linguiça_result = intent.getDoubleExtra("Linguiça",0.0)
        val cerveja_result = intent.getDoubleExtra("Cerveja", 0.0)
        val refrigerante_result = intent.getDoubleExtra("Refrigerante",0.0)

        val carne_resultText = findViewById<TextView>(R.id.Text_Result_Carne)
        val linguiça_resultText = findViewById<TextView>(R.id.Text_Result_Linguiça)
        val cerveja_resultText = findViewById<TextView>(R.id.Text_Result_Cerveja)
        val refrigerante_resultText = findViewById<TextView>(R.id.TexT_Result_Refrigerante)
        val formato = DecimalFormat("#,##0")

        carne_resultText.text = "Quantidade de carne: ${formato.format(carne_result)} Kg"
        linguiça_resultText.text = "Quantidade de linguiça: ${formato.format(linguiça_result)} KG"
        cerveja_resultText.text = "Quatidade de cerveja: $cerveja_result (lata)"
        refrigerante_resultText.text = "Quantidade de refrigerante: $refrigerante_result Litros"







        }
    }
