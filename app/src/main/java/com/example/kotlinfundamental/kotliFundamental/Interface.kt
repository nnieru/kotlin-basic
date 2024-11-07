package com.example.kotlinfundamental.kotliFundamental

// interface -> sebuah standar terhadap suat kondisi
interface  Animal {
    fun eat()
    fun sleep()
}

class Cat: Animal {
    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun sleep() {
        TODO("Not yet implemented")
    }

}

fun main () {
    val cat = Cat()
    cat.eat()
    cat.sleep()
}