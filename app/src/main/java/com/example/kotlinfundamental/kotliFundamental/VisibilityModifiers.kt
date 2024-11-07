package com.example.kotlinfundamental.kotliFundamental

// ada 4 access modifier:
// 1. public -> bisa diakses diluar scope
// 2. private
// 3. protected -> hanya dapat diakses class tsb dan class turunannya
// 4. internal -> hanya dapat diakses di 1 module yang sama | digunakan untuk membatasi akses dari modul lain

class KotlinVisibilityModifiers {
    private val name = "John Doe"
    fun showName() = name
    protected fun protectedShowName() = name
    internal fun internamShowName() = name
}

private val number = 1
fun main () {
    val visibilityModifiers = KotlinVisibilityModifiers()
    println(visibilityModifiers.showName())
    println(number)
}