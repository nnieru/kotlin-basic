package com.example.kotlinfundamental.kotliFundamental


fun main() {
    // List -> Ordered collection of items
    // Sets -> Unique unordered collections of items
    // Maps -> Sets of key-value pairs where keys are unique and map to only one value

    val readOnlyList = listOf("triangle", "square", "circle")
    println(readOnlyList)

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)
    shapes.add("prism")
    println(shapes)
    println(shapes.first())

    val readOnlyFruit =  setOf("apple", "banana", "cherry", "cherry")
    println(readOnlyFruit)
    println("This set has ${readOnlyFruit.count()} items")

    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    println("banana" in  fruit)

    val readOnlyJuiceMenu = mapOf(
        "apple" to  100,
        "kiwi" to 190,
        "orange" to 100
        )

    println(readOnlyJuiceMenu)
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")

    val juiceMenu: MutableMap<String, Int> = mutableMapOf(
        "apple" to  100,
        "kiwi" to 190,
        "orange" to 100
    )

    juiceMenu["coconut"] = 150
    println(juiceMenu)
    println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")
    println(readOnlyJuiceMenu.containsKey("kiwi"))
    println(readOnlyJuiceMenu.keys)

    println("orange" in readOnlyJuiceMenu.keys)


// Alternatively, you don't need to use the keys property
    println("orange" in readOnlyJuiceMenu)


    println(100 in readOnlyJuiceMenu.values)



}
