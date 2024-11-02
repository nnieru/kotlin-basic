package com.example.kotlinfundamental.kotliFundamental

// exception -> kesalahan yang menggagalkan suatu program


fun artihmaticException () {
    val number = 10
    val dividedBy = 0
    println(number/dividedBy)
}

fun numberFormatException () {
    val string = "name"
    println(string.toInt())
}

fun nullPointerException () {
    val name: String? = null
    println(name!!.length)
}

fun main() {
   try {
       nullPointerException()
       artihmaticException()
       numberFormatException()

   } catch (e: Exception)  {
       println(e.message)
   }
}