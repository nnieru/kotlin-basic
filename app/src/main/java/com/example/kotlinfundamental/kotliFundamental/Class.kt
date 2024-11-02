package com.example.kotlinfundamental.kotliFundamental


class Customer {

}

 class  Contact (val id: Int, var email: String = "example@gmail.com") {
     val category: String = "work"

     fun printId () {
         println(id)
     }
 }

// data class -> use for storing data

data class User(val name: String, val id: Int)


fun main() {
    val contact = Contact(1, "mary@gmail.com")

    println(contact.id)
    println(contact.email)
    println(contact.category)

    contact.printId()

    val user = User("Alex", 1)
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    // compare instances of data classes
    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user.equals(thirdUser)}")

    // copy
    println(user.copy("Max"))

    println(user.copy(id = 3))

}