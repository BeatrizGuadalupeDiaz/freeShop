package com.example.freeshopproject.ui.product

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freeshopproject.data.Product
import com.example.freeshopproject.data.Store
import com.example.freeshopproject.databinding.ActivityAddProductBinding

class MainActivityAdd : AppCompatActivity() {
    private lateinit var binding: ActivityAddProductBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityAddProductBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        navigation()

        binding.btnAdd.setOnClickListener {
            val name = binding.etName.text.toString().trim()
            val code = binding.etCode.text.toString().trim()
            val price = binding.etPrice.text.toString().trim()
            val quantity = binding.etQuantity.text.toString().trim()

            if (code.isNotEmpty() && quantity.isNotEmpty() && name.isNotEmpty() && price.isNotEmpty()) {
                val codeInt = code.toInt()
                val quantityInt = quantity.toInt()
                val nameString = name
                val priceDouble = price.toDouble()
                val product = Product(
                    nameString, codeInt, priceDouble, quantityInt
                )
                Store.added(product)
            } else {
                println("Error: Algunos campos están vacíos")
            }
        }
    }

    private fun navigation() {
        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}