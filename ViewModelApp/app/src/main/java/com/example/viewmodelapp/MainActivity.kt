package com.example.viewmodelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainActivityViewModel
    lateinit var binding: ActivityMainBinding
    lateinit var factory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        factory = MainActivityViewModelFactory(100)
        viewModel = ViewModelProvider(this, factory)
            .get(MainActivityViewModel::class.java)


        binding.textView.text = viewModel.getCurrentCount().toString()

        binding.button.setOnClickListener(){
            viewModel.getUpdatedCount()
            binding.textView.text=viewModel.getCurrentCount().toString()
        }
    }
}