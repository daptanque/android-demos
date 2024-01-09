package com.example.worldcupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1 - Adapter View : ListView
        var listView = findViewById<ListView>(R.id.listview)

        //2 - Adapter
        var adapter = MyAdapter(this,
                                generateData())

        listView?.adapter = adapter
        adapter?.notifyDataSetChanged()
    }

    //3- Data Source
    fun generateData(): ArrayList<CountryModel>{
        var  countriesList = ArrayList<CountryModel>()

        var country1 : CountryModel = CountryModel(
            "Brazil",
            "5",
            R.drawable.brazil
        )
        var country2 : CountryModel = CountryModel(
            "France",
            "2",
            R.drawable.france
        )
        var country3 : CountryModel = CountryModel(
            "Germany",
            "7",
            R.drawable.germany
        )
        var country4 : CountryModel = CountryModel(
            "Saudi Arabia",
            "0",
            R.drawable.saudiarabia
        )
        var country5 : CountryModel = CountryModel(
            "Spain",
            "4",
            R.drawable.spain
        )
        var country6 : CountryModel = CountryModel(
            "United Kingdom",
            "2",
            R.drawable.unitedkingdom
        )
        var country7 : CountryModel = CountryModel(
            "United States",
            "0",
            R.drawable.unitedstates
        )

        countriesList.add(country1)
        countriesList.add(country2)
        countriesList.add(country3)
        countriesList.add(country4)
        countriesList.add(country5)
        countriesList.add(country6)
        countriesList.add(country7)

        return countriesList
    }
}