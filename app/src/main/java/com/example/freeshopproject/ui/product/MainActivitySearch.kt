package com.example.freeshopproject.ui.product

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freeshopproject.R
import com.example.freeshopproject.databinding.ActivityAddProductBinding
import com.example.freeshopproject.databinding.ActivitySearchProductBinding

class MainActivitySearch : AppCompatActivity() {
    private lateinit var binding: ActivitySearchProductBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySearchProductBinding.inflate(layoutInflater)
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