package com.example.freeshopproject.ui.product

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freeshopproject.R
import com.example.freeshopproject.databinding.ActivitySearchProductBinding
import com.example.freeshopproject.databinding.ActivitySellProductBinding

class MainActivitySell : AppCompatActivity() {
    private lateinit var binding: ActivitySellProductBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySellProductBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        navigation()
    }
    private fun navigation(){
        binding.btnBack.setOnClickListener{
            finish()
        }
    }
}