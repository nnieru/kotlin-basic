package com.example.kotlinfundamental.kotliFundamental

fun <T>printGenericList (list: List<T>) {
    for (item in list) {
        println(item)
    }
}

class KotlinGeneric <T>(val value: T)

fun main() {
    printGenericList<String>(listOf("1", "2", "3"))
    printGenericList<Boolean>(listOf(true, true, false))

    val genericClass = KotlinGeneric(10)
    println(genericClass.value)

    val stringClass = KotlinGeneric<String>("test")
    println(stringClass.value)
}