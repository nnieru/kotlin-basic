package com.example.kotlinfundamental.kotliFundamental

// tidak bisa di inisialisasi
// hanya bisa di inherit
// abstract class -> kita hanya tau fungsinya tapi tidak tahu implementasinya, sehingga implementasinya harus dibuat di child classnya

abstract class Kendaraan {
    abstract fun showName(firstName: String, lastName: String)
    abstract fun showColor(color: String)

}

class Mobil: Kendaraan() {
    override fun showName(firstName: String, lastName: String) {
        println("Name kendaraan: $firstName $lastName")
    }

    override fun showColor(color: String) {
        println("warna kendaraan: $color")
    }

}

fun main() {
    val mobil = Mobil()
    mobil.showName("Honda", "CRV")
    mobil.showColor("red")
}