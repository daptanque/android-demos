package com.example.viewmodelapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivityViewModelFactory(private val startingNumber:Int) : ViewModelProvider.Factory {


    //boilerplate code
    override fun <T: ViewModel> create(modelClass: Class<T>): T{
        if(modelClass.isAssignableFrom(MainActivityViewModel::class.java)){
            return MainActivityViewModel(startingNumber) as T
        }
        throw IllegalArgumentException("Unknown view model class")
    }

}