package com.example.kotlinfundamental.kotliFundamental

fun main() {
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)

    // in kotlin we don't have a ternary operation, here is the alternative
    val a = 1
    val b = 2
    println(if (a > b) a else b)

    // when
    val obj = "Hello"
    when (obj) {
        "1" -> println("one")
        "Hello" -> println("greeting")
        else -> println("Unknown")
    }

    // An expression returns a value that can be used later in your code.
    val obj1 = "Hello"

    val result = when (obj1) {
        // If obj equals "1", sets result to "one"
        "1" -> "One"
        // If obj equals "Hello", sets result to "Greeting"
        "Hello" -> "Greeting"
        // Sets result to "Unknown" if no previous condition is satisfied
        else -> "Unknown"
    }
    println(result)

    // use when without a subject -> to check a chain of boolean
    val trafficLight = "red"
    val trafficAction = when {
        trafficLight == "red" -> "stop"
        trafficLight == "yellow" -> "slow down"
        else -> "go"
    }

    println(trafficAction)

    // Ranges
    val range1To4 = 1..4
    val rangeNotIncludeEndValue = 1..<4
    val reverseOrderRange = 4 downTo  1
    val rangeWithSetp = 1..5 step 2

    // Loops
    for (num in 1..5) {
        print(num)
    }

    val cakes = listOf("carrot","cheese","chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

    // while
    var cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 3 ) {
        println("Eat a cake")
        cakesEaten ++
    }
    do {
        println("Bake a cake")
        cakesBaked ++
    } while (cakesBaked < cakesEaten)



}