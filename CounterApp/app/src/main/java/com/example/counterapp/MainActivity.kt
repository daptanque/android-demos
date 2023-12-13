package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btn)
        val result_txt: TextView = findViewById(R.id.result_text)

        btn.setOnClickListener(){
            result_txt.setText(""+increaseCounter())
        }
    }

    fun increaseCounter(): Int{
        counter++
        return counter
    }
}