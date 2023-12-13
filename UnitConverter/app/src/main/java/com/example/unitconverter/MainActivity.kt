package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt : EditText = findViewById(R.id.editTextText)
        val btn : Button = findViewById(R.id.button)
        val result_text : TextView = findViewById(R.id.result_text)

        btn.setOnClickListener(){
            val kilos: Double = edt.text.toString().toDouble()

            result_text.setText(""+convertToPounds(kilos) + "\n Pounds")
        }
    }

    fun convertToPounds(kilos : Double): Double{
        var pounds = kilos*2.20462
        return pounds
    }
}