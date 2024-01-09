package com.example.simplelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1 - Adapter View: ListView
        var listview : ListView = findViewById(R.id.listview)

        //2 - Data Source: Array of Strings
        var world_cup_array = arrayOf(
            "Germany", "Brazil", "England", "Spain", "Qatar"
        )

        //3 - Adapter
        val arrayAdapter: ArrayAdapter<*>
        arrayAdapter = ArrayAdapter(this,
            R.layout.list_item,
            R.id.textView,
            world_cup_array)

        listview.adapter = arrayAdapter

    }
}