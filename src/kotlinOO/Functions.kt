package kotlinOO

fun main(){
    /**
     * Default return type for a function is Unit
     */

    /**
     * Functions can have both block body and expression body
     */
    println(labelMultiply(4, 5, "final result is"))

    /**
     * Varargs and Spread operators -
     * In Java, we can pass array of Type T where varargs of Type T are accepted in a function,
     * Same can't be done in kotlin , so a spread operator * spreads the elements from array and pass the indviduals
     */

    val car1= Car("Green", "21", 2020)
    val car2= Car("Red", "22", 2021)
    val car3= Car("Blue", "23", 2022)

    printCarColors(car1, car2, car3)

    val arrayOfCar = arrayOf(car1, car2, car3)

    printCarColors(*arrayOfCar) // printCarColors(arrayOfCar) wont work
}

fun labelMultiply(a: Int, b: Int, label: String) = "$label ${a*b}"

fun printCarColors(vararg cars: Car){
    for( car in cars){
        println(car.color)
    }
}