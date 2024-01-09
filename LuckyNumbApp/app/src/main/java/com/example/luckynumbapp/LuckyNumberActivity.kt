package com.example.luckynumbapp

import android.content.Intent
import android.content.Intent.ACTION_SEND
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class LuckyNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number)

        val text1: TextView = findViewById(R.id.text1)
        val luckyText: TextView = findViewById(R.id.luckyNumTxt)
        val shareBtn: Button = findViewById(R.id.shareBtn)

        var user_name = receiveUsername()

        var random_num = generateRandomNum()
        Toast.makeText(this, ""+random_num, Toast.LENGTH_LONG).show()

        luckyText.setText(""+random_num)

        shareBtn.setOnClickListener(){
            shareData(user_name,random_num)
        }
    }

    fun generateRandomNum(): Int {
        val random = Random.nextInt(1000)
        return random
    }

    fun receiveUsername() : String{
        var bundle: Bundle? = intent.extras
        var username = bundle?.get("name").toString()//get("name").toString()
        return username
    }

    fun shareData(username: String, num: Int){
        var i = Intent(Intent.ACTION_SEND)
        i.setType("text/plain")
        i.putExtra(Intent.EXTRA_SUBJECT, "$username jj")
        i.putExtra(Intent.EXTRA_TEXT, "His lucky number is $num")
        startActivity(i)
    }
}