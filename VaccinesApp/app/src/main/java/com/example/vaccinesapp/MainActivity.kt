package com.example.vaccinesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //AdapterView
        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,
            false)

        //Data Source
        var vaccinesList : ArrayList<VaccineModel> = ArrayList()

        val v1 : VaccineModel = VaccineModel("COVID-19", R.drawable.vaccine1)
        val v2 : VaccineModel = VaccineModel("Hepatitis B Vaccine", R.drawable.vaccine4)
        val v3 : VaccineModel = VaccineModel("Tetanus Vaccine", R.drawable.vaccine5)
        val v4 : VaccineModel = VaccineModel("Pneumococal Vaccine", R.drawable.vaccine6)
        val v5 : VaccineModel = VaccineModel("Rotavirus Vaccine", R.drawable.vaccine7)
        val v6 : VaccineModel = VaccineModel("Measles Vaccine", R.drawable.vaccine8)
        val v7 : VaccineModel = VaccineModel("Chickenpox Vaccione", R.drawable.vaccine9)

        vaccinesList.add(v1)
        vaccinesList.add(v2)
        vaccinesList.add(v3)
        vaccinesList.add(v4)
        vaccinesList.add(v5)
        vaccinesList.add(v6)
        vaccinesList.add(v7)

        //Adapter
        val adapter = MyAdapter(vaccinesList)
        recyclerView.adapter = adapter

    }
}