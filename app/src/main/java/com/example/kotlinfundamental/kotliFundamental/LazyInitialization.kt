package com.example.kotlinfundamental.kotliFundamental

// Lazy Initialization -> sistem akan menunda pembuatan objek sampai objek tsb dipanggil

// advantage menggunakan lazy
// 1. menghemat memori
// 2. meningkatkan perfroma
// 3. menghindari penggunaan variable yang tidak perlu

class  KotlinLazy {
    val age: Int = 10
    lateinit var name: String // late init memungkinkan kita tidak perlu inisialisasi nilainya diawal

    // akan diinisialisai ketika dipanggil
    val number: Int by lazy {
        println("number was created")
        10
    }
}

fun main () {
    val kotlinLazy = KotlinLazy()
    println(kotlinLazy.age)
    println(kotlinLazy.number)
}
