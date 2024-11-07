package com.example.kotlinfundamental.kotliFundamental

val showNameWithLambda =  { println("JohnDoe") }
val showHelloWithName = {name: String -> println("hello $name") }
val showMyAgeAfter5Years = {age: Int -> println(age + 5) }
val sumTotal: (Int, Int) -> Int = {number1: Int, number2: Int ->  number1 + number2}


fun main () {
    showNameWithLambda()
    showHelloWithName("Andi")
    showMyAgeAfter5Years(10)
    println(sumTotal(1,5))
}