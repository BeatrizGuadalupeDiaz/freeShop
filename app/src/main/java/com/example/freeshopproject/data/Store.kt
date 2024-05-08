package com.example.freeshopproject.data

class Store() {
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
        if (!list.contains(product)) {
            println("Error, no existe")
            return
        }
        list.remove(product)
    }

    fun search(product: Product): Product {
        if (!list.contains(product)) {
            println("Error, no existe")
        }
        return product
    }

    fun sell(product: Product) {
        if (!list.contains(product)) {
            println("Error, no existe")
            return
        }
        val index = list.indexOf(product)
        //list[index].quantity = list[index].quantity - product.quantity
    }
}