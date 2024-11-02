package com.example.kotlinfundamental.kotliFundamental



fun main() {
    var neverNull: String = "this var cannot be null"
//    neverNull = null -> compiler error

    var nullableString: String? = "this can be null"
    nullableString = null
    println(nullableString)
}