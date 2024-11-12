package com.viniciusmelo.churrascmetro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val edt_adultos = findViewById<TextInputEditText>(R.id.edt_adultos)
        val edt_crianças = findViewById<TextInputEditText>(R.id.edt_crianças)
        val edt_duração = findViewById<TextInputEditText>(R.id.edt_duração)
        val btn_calcular = findViewById<Button>(R.id.button_calcular)

        btn_calcular.setOnClickListener {

        val adultosSpring =edt_adultos.text.toString()
        val criançasSpring = edt_crianças.text.toString()
        val duraçãoSpring = edt_duração.text.toString()

        if (adultosSpring == "" || criançasSpring == "" || duraçãoSpring == "") {
        Snackbar.make(
        edt_adultos,
            "Preencha todos os campos",
        Snackbar.LENGTH_LONG).show()

         } else {

         val adultos: Int = adultosSpring.toInt()
         val crianças: Int = criançasSpring.toInt()
         val duração: Int = duraçãoSpring.toInt()

         val carne_adulto = if (duração >5) 500 else 300
         val carne_criança = if (duração >5) 250 else 100
         val linguiça_adulto = if (duração >5) 400 else 200
         val linguiça_criança = if (duração >5) 200 else 100
         val cerveja_adulto = if (duração >5) 6 else 3
         val refrigerante_adulto = if (duração >5) 2 else 1
         val refrigerante_criança: Double = if (duração <5) 1.0 else 0.5

         val carne_total = (carne_adulto* adultos) + (carne_criança*crianças)
         val linguiça_total = (linguiça_adulto*adultos) + (linguiça_criança*crianças)
         val cerveja_total = cerveja_adulto*adultos
         val refrigerante_total = (refrigerante_adulto*adultos) + (refrigerante_criança*crianças)

         val intent = Intent (this, Result_Screen :: class.java)
            intent.putExtra("Carne", carne_total)
            intent.putExtra("Linguiça", linguiça_total)
            intent.putExtra("Cerveja", cerveja_total)
            intent.putExtra("Refrigerante", refrigerante_total)

            startActivity(intent)


      }
    }
  }
}
