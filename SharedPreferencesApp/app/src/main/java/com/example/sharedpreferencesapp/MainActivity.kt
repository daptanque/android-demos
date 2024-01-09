package com.example.sharedpreferencesapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var name_textView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText : EditText = findViewById(R.id.editText)
        val btn : Button = findViewById(R.id.btn)
        name_textView = findViewById(R.id.textViewName)

        displaySavedName()

        btn.setOnClickListener(){
            val enteredText : String = editText.text.toString()

            saveNameInSharedPreferences(enteredText)

        }

    }

    private fun saveNameInSharedPreferences(enteredText: String) {

        //Save the Text in SP (create, editor, add)
        val sharedPreferences : SharedPreferences =
            getSharedPreferences(
                "UserName",
                MODE_PRIVATE
            )

        //Write data to SP
        val editor : SharedPreferences.Editor = sharedPreferences.edit()


        editor.putString("name", enteredText)
        editor.commit()
    }

    fun displaySavedName(){
        val sharedPreferences : SharedPreferences = getSharedPreferences("UserName", MODE_PRIVATE)

        val s1 : String? = sharedPreferences.getString("name", "")

        name_textView.setText(s1)
    }


}