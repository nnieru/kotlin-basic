package com.example.kotlinfundamental.kotliFundamental


fun main() {
    // read-only variable
    val popcorn: Int = 5
    val hotdog: String = "hello"

    println("popcorn : ${popcorn}")
    println("hotdog: ${hotdog}")

    // mutable variable
    var number: Int = 5
    number += 1

    println(number)
}