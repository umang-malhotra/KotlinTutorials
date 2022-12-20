package LambdasNCollections

fun main(args: Array<String>) {
    val immutableMap = mapOf<Int, Car>(1 to Car("Green", "Toyota", 2015),
            2 to Car("Red", "Ford", 2016),
            3 to Car("Silver", "Honda", 2016),
            17 to Car("Red", "BMW", 2018),
            19 to Car("Yellow", "Ford", 2019))

    /**
     * When we used filter / map method to manipulate a collection
     * There are intermediate collections are being created.
     * We don't want to create if collection is huge (Like 100 thousands values)
     * Or there is huge chane of methods.
     * THen we use sequences
     */

    /**
     * Sequences are pretty much same as Streams in Java
     * Kotlin has its own sequences and does not use Stream becasue Stream were made available in Java 8
     * and is not available on every platform. Eg. Android doesn't support Java 8
     */

    /**
     * Sequences pass along values one by one, so no collections are created at new steps
     */

    /**
     * Kotlin's collections are very efficint , so we only use sequences when data size is large
     */

    println(immutableMap.asSequence().filter { it.value.model == "Ford" }.map { it.value.color })


    // Intermediate operations return sequences, so when we are done we want something more concrete

    val newList = listOf("Joe", "Marry", "Jane").asSequence()
            .filter {  println("filtering $it"); it == "Joe" }
            .map { println("mapping $it"); it.toUpperCase() }
            .toList()

    // They are running iteratively and not collectively when done in sequence, while collections filters first and then execute the values.
    println(newList)



}