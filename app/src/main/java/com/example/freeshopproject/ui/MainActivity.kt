package com.example.freeshopproject.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freeshopproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //se inicializan funcines o variables
        navigation()
    }
    //se crean funciones
    private fun navigation(){
        binding.btnLogin.setOnClickListener {
         startActivity(Intent(this,MainActivityMenu::class.java))
        }
    }
}