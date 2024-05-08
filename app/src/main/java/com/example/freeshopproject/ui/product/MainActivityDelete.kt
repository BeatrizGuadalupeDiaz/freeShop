package com.example.freeshopproject.ui.product

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freeshopproject.R
import com.example.freeshopproject.databinding.ActivityDeleteProductBinding
import com.example.freeshopproject.databinding.ActivitySearchProductBinding

class MainActivityDelete : AppCompatActivity() {
    private lateinit var binding: ActivityDeleteProductBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDeleteProductBinding.inflate(layoutInflater)
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