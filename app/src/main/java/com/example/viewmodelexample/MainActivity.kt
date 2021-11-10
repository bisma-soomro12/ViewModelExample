package com.example.viewmodelexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),LifecycleOwner {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // we will connect the view model class to the main activity
        var viewModel =ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.txt.text=viewModel.num.toString()
//        var num=0
        binding.button.setOnClickListener {
//            num++
//            binding.txt.text=num.toString()
            viewModel.addNo()
            binding.txt.text=viewModel.num.toString()
        }
    }
}