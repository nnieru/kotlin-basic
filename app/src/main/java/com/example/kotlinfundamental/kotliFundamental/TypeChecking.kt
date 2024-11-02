package com.example.kotlinfundamental.kotliFundamental

fun getType (data: Any) {
 when(data) {
     is Int -> println("Integer")
     is String -> println("String")
     is Boolean -> println("Boolean")
     else -> println("Unknown")
 }
}

fun main() {
    getType(1)
    getType("hello")
    getType(true)
    getType(1F)
}