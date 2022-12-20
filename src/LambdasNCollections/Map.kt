package LambdasNCollections

fun main(){
    /**
     * Like lists, Map can be mutable as well as Immutable Lists
     */

    val immutableMap = mapOf<Int, Car>(1 to Car("Green", "Toyota", 2015),
                            2 to Car("Red", "Ford", 2016),
                            3 to Car("Silver", "Honda", 2013))

    println(immutableMap.javaClass)

    val mutableMap = mutableMapOf<String, Car>( "John's Car" to Car("Green", "Toyota", 2015))
    println(mutableMap.javaClass)

    /**
     * In both cases immutable map and mutable map, kotlin gives a LinkedHashMap
     * Resaon -> LinkedHashMap has a predictable order
     * Note - HashMaps are always mutable
     */

    // Destructuring Declarations
    println("Desturcturing -------- ")
    val myPair = Pair(12, "String")
    val (firsval, secondVal) = myPair // These can also be done view firsval = myPair.first, myPair.second


    println(firsval.toString() + " " + secondVal)

    // In a similar destructured way we can traverse a Map

    for(entry in mutableMap){
        println(entry.key)
        println(entry.value)
    }

    for((key, valu) in mutableMap ){
        println(key + " " + valu)
    }

    /**
     * If you want to enable destructuring in a class, you need to implement component functions
     * We can do this in Car class as well, and properties have to be public for destructuring
     */

    val umangCar = Car("Red", "Audi", 2028)

    val (color, model, year, test) = umangCar

    println("$color $model $year $test")

    /**
     * Note in Data class, you get destructuring for free as well
     */




}

class Car(val color: String, val model: String, val year: Int) {
    operator fun component1(): Any {
        return color
    }

    operator fun component2() = model
    operator fun component3() = year
    operator fun component4() = "always test"
    override fun toString(): String {
        return "Car(color='$color', model='$model', year=$year)"
    }


}