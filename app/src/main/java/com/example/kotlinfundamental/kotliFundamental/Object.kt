package com.example.kotlinfundamental.kotliFundamental

// object -> class yang dipastikan hanya dibuat 1 x (singleton)
// companion object -> konsepnya sama seperti object tapi bisa digunakan didalam sebuah class
// singleton -> konsep object yang dibuat hanya 1 kali untuk seluruh program (hanya 1 instance aja yang dibuat)


data class Credential(val username: String)

// singleton
object  CredentialData {
    var username: String = ""
}

// companion object
class Personn {
    var name: String = ""
    var age: Int = 0

    // singleton yang dimiliki oleh suatu class
    companion object {
       const val MAX_AGE: Int = 100

        // tipe fungsi seperti ini biasanya jika  terdapat assigned value
        fun initialize(name: String, age: Int) = Personn().apply {
            this.name = name
            this.age = age
        }
    }

    // contoh jika digunakan di dalam kelas
    fun showMaxAge() {
        println(MAX_AGE)
    }

}

fun main () {

    // objek biasa
    val credential = Credential("admin")
    println(credential.username)

    // singleton
    CredentialData.username = "super_admin"
    println(CredentialData.username)

    // companion object
    println(Personn.MAX_AGE)
    val person = Personn.initialize("John", 10)

}