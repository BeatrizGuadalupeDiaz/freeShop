package com.example.freeshopproject.ui.product

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freeshopproject.R
import com.example.freeshopproject.databinding.ActivityFavoritesProductsBinding
import com.example.freeshopproject.databinding.ActivitySearchProductBinding

class MainActivityFavorites : AppCompatActivity() {
    private lateinit var binding: ActivityFavoritesProductsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFavoritesProductsBinding.inflate(layoutInflater)
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