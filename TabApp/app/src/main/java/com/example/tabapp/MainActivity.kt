package com.example.tabapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    val tabsArray = arrayOf("Books", "Games", "Movies")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager2>(R.id.viewpager)
        val tablayout = findViewById<TabLayout>(R.id.tabLayout)

        val my_adapter = ViewPagerAdapter(
            supportFragmentManager,
            lifecycle
        )

        viewPager.adapter=my_adapter

        //link the viewpager with the tab layout
        TabLayoutMediator(tablayout, viewPager){
            tab, position -> tab.text = tabsArray[position]
        }.attach()

    }
}