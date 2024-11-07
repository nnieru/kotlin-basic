package com.example.kotlinfundamental.kotliFundamental

// sealed class -> class yang mirip dengan enum class tapi dengan beberapa data yang lebihh fleksibel

// enum class tipe datanya harus sama semua, kalo 1 int semua int

sealed class Resouce {
    data class Success(val data: String): Resouce()
    data class Error(val error: String): Resouce()
    object Loading: Resouce()
}

fun main() {
    val success = Resouce.Success("OK")
    println(success)
}