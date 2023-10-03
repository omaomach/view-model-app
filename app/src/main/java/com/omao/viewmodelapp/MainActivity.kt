package com.omao.viewmodelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.omao.viewmodelapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var counter = 0
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,
            R.layout.activity_main)

        binding.textView1.text = counter.toString()
        binding.btn1.setOnClickListener() {
            counter++
            binding.textView1.text = counter.toString()
        }

    }
}