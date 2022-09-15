package com.example.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edtText = findViewById<EditText>(R.id.edt_nome)
        val btn = findViewById<Button>(R.id.btn_cliqueAqui)
        val resultText = findViewById<TextView>(R.id.txv_resultado)


        btn.setOnClickListener{
            val nome: String = edtText.editableText.toString()
            resultText.text = nome
        }
    }

}