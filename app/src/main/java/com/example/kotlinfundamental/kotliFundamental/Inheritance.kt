package com.example.kotlinfundamental.kotliFundamental

// untuk dapat di override harus diberikan open access modifier

open class  Vehicle {
    protected var wheel: Int = 0

    fun showNumberOfWheels() {
        println("Number of wheels is $wheel")
    }

    open fun start() {
        println("Vehicle started!")
    }
}

class Carr: Vehicle() {
    var engineType: String = ""

    fun showEngineType() {
        println("Engine type is $engineType")
    }

    fun setNumberOfWheel(numberOfWheel: Int) {
        this.wheel = numberOfWheel;
    }

    override fun start() {
        println("Car engiine started!")

        // memanggil function asli dari parentnya
        super.start()
    }
}

fun main () {
    val car = Carr()
    car.engineType = "v6"
    car.showEngineType()
    car.setNumberOfWheel(4)
    car.showNumberOfWheels()
    car.start()

    val vehicle = Vehicle()
    vehicle.showNumberOfWheels()
    vehicle.start()
}