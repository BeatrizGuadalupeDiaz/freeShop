package com.example.freeshopproject.data
 class Product (props: Props){
     val list = mutableListOf<Props>()

     fun add(product: Props){
         if (product.equals(list)){
             val index = list.indexOf(product)
             list[index].quantity = list[index].quantity + product.quantity
         }
             list.add(product)
     }

     fun delete(product: Props){
         if (!list.contains(product)){
             println("Error, no existe")
            return
         }
         list.remove(product)
     }

     fun search(product: Props): Props {
         if (!list.contains(product)){
             println("Error, no existe")
         }
         return product
     }

     fun sell(product: Props) {
         if (!list.contains(product)) {
             println("Error, no existe")
             return
         }
         val index = list.indexOf(product)
         list[index].quantity = list[index].quantity - product.quantity
     }
}