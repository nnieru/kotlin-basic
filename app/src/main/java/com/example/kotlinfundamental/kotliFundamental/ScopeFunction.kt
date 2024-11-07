package com.example.kotlinfundamental.kotliFundamental

// scope function -> eksekusi fungsi pada konteks object tertentu
// 1. scope function dengan lambda argument

fun main() {
    val message: String? = "error"

    // scoping function hanya untuk message
    message?.let {
        val length =  it.length * 2
        val text = "text length: $length"
        println(text)
    }


    // 2. function dengan lambda recevier
    val result = with(message) {
        println("value its $this")
        println("with length ${this?.length}")
    }

    message?.apply {
        val length = length?.times(2)
        val text = "text length $length"
        println(text)
    }





}