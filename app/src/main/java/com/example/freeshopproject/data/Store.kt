package com.example.freeshopproject.data

object Store {
    val list: MutableList<Product> = mutableListOf()

    fun added(product: Product) {
        val existingProduct = list.find { it.code == product.code }
        if (existingProduct != null) {
            existingProduct.quantity += product.quantity
            println("El producto ${existingProduct.name} ha sido actualizado, cantidad: ${existingProduct.quantity}")
        } else {
            list.add(product)
            println("${product.name},${product.code},${product.price},${product.quantity} producto agregado")
        }
    }

    fun delete(product: Product) {
        val existingProduct = list.find { it.code === product.code }
        if (existingProduct != null) {
            list.remove(product)
            println("Producto: ${product.name}, ${product.code}, ${product.quantity} elimnado ")
        } else {
            println("El producto no existe")
        }
    }

    fun search(product: String): Product {
        val existingProduct = list.find {
            try {
                it.code == product.toInt()
            } catch (e: NumberFormatException) {
                false
            } || it.name == product
        }
        var productFind: Product = Product("", 0, 0.0, 0)
        if (existingProduct != null) {
            productFind = existingProduct
            println("producto si existe")
        } else {
            println("El producto no existe")
        }
        return productFind
    }

    fun sell(product: Product) {
        val existingProduct = list.find { it.code == product.code }
        if (existingProduct != null) {
            if (existingProduct.quantity < product.quantity) {
                println("cantidad insuficiente para ser vendida")
                return
            }
            existingProduct.quantity -= product.quantity
            println("El producto ${existingProduct.name} ha sido actualizado, cantidad: ${existingProduct.quantity}")
        }
    }
}