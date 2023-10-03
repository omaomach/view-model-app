package com.omao.viewmodelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.omao.viewmodelapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var factory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // binding object
        binding = DataBindingUtil.setContentView(this,
            R.layout.activity_main)

        // View Model Factory
        factory = MainActivityViewModelFactory(1000)

        viewModel = ViewModelProvider(this, factory)[MainActivityViewModel::class.java]

        binding.textView1.text = viewModel.getCurrentCount().toString()
        binding.btn1.setOnClickListener() {
            binding.textView1.text = viewModel.getUpdatedCount().toString()
        }

    }
}