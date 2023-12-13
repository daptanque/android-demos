package com.example.viewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt : EditText = findViewById(R.id.edt)
        val btn : Button = findViewById(R.id.btn)

        btn.setOnClickListener(){
            var enteredText = edt.text

            Toast.makeText(this@MainActivity, "Hello $enteredText", Toast.LENGTH_LONG).show()
        }

    }
}