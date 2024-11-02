package com.example.kotlinfundamental.kotliFundamental

fun getType (data: Any) {
 when(data) {
     is Int -> println("Integer")
     is String -> println("String")
     is Boolean -> println("Boolean")
     is TypeChecking -> println("This is Enum  Class of TypeChecking")
     else -> println("Unknown")
 }
}

fun main() {
    getType(1)
    getType("hello")
    getType(true)
    getType(1F)
    getType(TypeChecking.TYPE_2)
    castingExample()
}

enum class  TypeChecking {
    TYPE_1, TYPE_2, TYPE_3
}

// casting -> merubah satu tipe data ke bentuk tipe data lain

fun castingExample() {
    val data = "1"
    val number = data.toInt()
    val input = "1000.100"
    val doubleInput = input.toDouble()
    val discount = 10.0

    val total = doubleInput - (doubleInput * discount / 100)
    println(number)
    println(total)
}