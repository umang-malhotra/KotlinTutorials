package LambdasNCollections

fun main(){
    // Can't have duplicate items

    val setInts = setOf(15, 32, 12, 18)
    println(setInts)

    println(setInts.plus(22)) // setInts is an immutable set, and still does not have 22, same holds true for mutable sets
    println(setInts)

    val newSet = setInts.plus(22)
    println("New Set " + newSet)

    println(setInts.minus(1))

    // Average Value in Set -
    println(setInts.average())

    /**
    // More Collection functions
    */
    val immutableMap = mapOf<Int, Car>(1 to Car("Green", "Toyota", 2015),
            2 to Car("Red", "Ford", 2016),
            3 to Car("Silver", "Honda", 2016),
            17 to Car("Red", "BMW", 2018),
            19 to Car("Yellow", "Ford", 2019))

    /** Filter */
    println( "Filter odd numbers from sets "  + setInts.filter { it %2 !=0 })

    println("Filter cars manufactured in 2016" + immutableMap.filter { (key, value) -> value.year.equals(2016)})

    // Note -> Filters are functions which return a new collection and does not operate on same collection
    // You can keep the elements that you want, but the collections itself not change

    /** Map */
    val ints = arrayOf(1, 2, 3, 4,5)
    val add10List = ints.map{it+10}
    println("Added 10 to List " + add10List)

    // Collect all the years of Cars from immutableMap declared above -

    println(immutableMap.map { it.value.year }) // A collection that contains year of Cars


    // Get colors of Ford Car
    println("Color of Fords - " + immutableMap.filter { it.value.model.equals("Ford") }.map { it.value.color })

    // Check if all elements in a Collection match a condition
    println(immutableMap.all { it.value.year > 2010 })

    // Check if any element in a collection match a collection
    println(immutableMap.any { it.value.year > 2020 }) // Use count to count the numbers


    // We use find function when we are working on List
    val carsList = immutableMap.values
    println(carsList.find { it.year > 2000 }) // Finds first Value

    // Group By function
    println(carsList.groupBy { it.color })

    // Sort By Function
    println(carsList.sortedBy { it.year }.reversed())



}