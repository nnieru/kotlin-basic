package com.example.kotlinfundamental.kotliFundamental

fun hello () {
    println("Hello")
}

// return function
fun sum (x: Int, y: Int): Int {
    return x + y
}

// default parameter
fun printMessageWithPrefix(message: String, prefix: String = "INFO") {
    println("[$prefix] $message")
}

// single expression function
fun substract(x: Int, y: Int) = x - y

// lambda expression
val upperCaseString: (String) -> String = {text: String -> text.uppercase()}

// pass to another function
val numbers = listOf(1,2,3,4,5,6,7, -1)
val positives = numbers.filter { x -> x > 0 }
val isNegative =  { x: Int -> x < 0 }
val negatives = numbers.filter(isNegative)
val doubled = numbers.map { x -> x * 2 }
val isTripled: (Int) -> Int = {x: Int -> x * 3}
val tripled = numbers.map(isTripled)

fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> {value -> value * 60 * 60}
    "minute" -> {value -> value * 60}
    "second" -> {value -> value}
    else -> {value -> value}
}




fun main () {
    hello()
    println(sum(1,2))

    // named argument
    println(sum(x=2, y = 3))

    printMessageWithPrefix("this is info message")

    println(substract(5,3))

    println(upperCaseString("hello world"))

    println(positives)
    println(negatives)
    println(doubled)
    println(tripled)

    val timesInMinutes = listOf(2,10, 15, 1)
    val minTosec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(minTosec).sum()
    println("Total time is $totalTimeInSeconds secs")
}