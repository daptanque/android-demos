package com.example.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.fragments.BooksFragment
import com.example.fragments.GameFragment
import com.example.fragments.MoviesFragment

val NUMBER_OF_TABS = 3

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager,lifecycle) {

    override fun getItemCount(): Int {
        return NUMBER_OF_TABS
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return BooksFragment()
            1 -> return GameFragment()
        }
        return MoviesFragment()
    }


}