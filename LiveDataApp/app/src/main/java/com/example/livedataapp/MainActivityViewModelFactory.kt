package com.example.livedataapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivityViewModelFactory(private val startingNumber:Int): ViewModelProvider.Factory {

    //always the same code - boilerplate
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainActivityViewModel::class.java)){
            return MainActivityViewModel(startingNumber) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }

}