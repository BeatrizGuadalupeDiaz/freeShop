package com.example.freeshopproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freeshopproject.R
import com.example.freeshopproject.databinding.ActivityAddProductBinding
import com.example.freeshopproject.databinding.ActivityTermsAndConditionsBinding

class MainActivityTermsAndConditions : AppCompatActivity() {
    private lateinit var binding: ActivityTermsAndConditionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTermsAndConditionsBinding.inflate(layoutInflater)
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