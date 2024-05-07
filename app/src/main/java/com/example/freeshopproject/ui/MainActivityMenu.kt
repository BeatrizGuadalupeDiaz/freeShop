package com.example.freeshopproject.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freeshopproject.databinding.ActivityMenuBinding
import com.example.freeshopproject.ui.product.MainActivityAdd
import com.example.freeshopproject.ui.product.MainActivityDelete
import com.example.freeshopproject.ui.product.MainActivityFavorites
import com.example.freeshopproject.ui.product.MainActivitySearch
import com.example.freeshopproject.ui.product.MainActivitySell

class MainActivityMenu : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigation()
    }
    private fun navigation(){
        binding.btnAdd.setOnClickListener {
            startActivity(Intent(this, MainActivityAdd::class.java))
        }
        binding.btnDelete.setOnClickListener{
            startActivity(Intent(this, MainActivityDelete::class.java))
        }
        binding.btnSearch.setOnClickListener{
            startActivity(Intent(this, MainActivitySearch::class.java))
        }
        binding.btnSell.setOnClickListener{
            startActivity(Intent(this, MainActivitySell::class.java))
        }
        binding.btnFavorites.setOnClickListener{
            startActivity(Intent(this, MainActivityFavorites::class.java))
        }
        binding.btnTvTermsAndCondition.setOnClickListener{
            startActivity(Intent(this, MainActivityTermsAndConditions::class.java))
        }
    }
}