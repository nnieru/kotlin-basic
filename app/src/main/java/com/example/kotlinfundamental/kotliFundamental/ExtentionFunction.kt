package com.example.kotlinfundamental.kotliFundamental

// kotlin extension -> menambah function pada sebuah class yang sudah ada
// kotlin extension dapat dibagi menjadi 3:
// 1. property extension
// 2. function extension
// 3. infix extension


// property extension
val Int.slice: Int
    get() = this/2

// function extension
fun Int.sum(value: Int): Int {
    return this + value
}

// infix extension
infix fun Int.divide(value: Int): Int {
    return this / value
}

fun main () {
    println(10.slice)
    println(10.sum(10))
    println(10 divide 5)
}