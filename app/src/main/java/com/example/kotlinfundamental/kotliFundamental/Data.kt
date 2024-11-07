package com.example.kotlinfundamental.kotliFundamental


// kotlin data class -> class untuk menyimpan/ mengatur sebuah data


class  NormalPerson (val name: String, val age: Int) {
    override fun toString(): String {
        return "NormalPerson(name=$name, age=$age)"
    }
}

data class Person(val name: String, val age: Int) // otomatis genrate function copy, to string, equal, hashcode, dll

fun main () {
    val normalPerson = NormalPerson("John Doe", age = 17)
    val person1 = Person(name = "John Doe", age = 17)
    val person2 = Person(name = "John Doe", age = 19)
    val copyPerson1 = person1.copy(age =  20)

    println(normalPerson.toString())
    println(person1.toString())
    println(person1.equals(person2))
    println(copyPerson1.toString())
}