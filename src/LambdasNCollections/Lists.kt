package LambdasNCollections

fun main(){
    /**
     * Most time Kotlin uses Java's collections classes, sometimes it uses it's own
     * even though when it uses Java's collection classes you can do more with it.
     */

    // Take a look at Collections class
//    Collection

    val seasons = listOf("Winter", "Summer")
    println(seasons.javaClass)

    val emptyList = emptyList<String>()
    println(seasons.javaClass)

    val notNullList = listOfNotNull("Hello", "Goodbye", null, "Slayer")
    println(notNullList)

    val arrayList = arrayListOf(1, 2, 3)
    println(arrayList.javaClass)

    val mutableList =  mutableListOf<Int>(1, 2, 3)
    println(mutableList.javaClass)

    val array = arrayOf("List", "Item")
    val listFromArray = listOf(*array) // Spread Operator used
    array.toList() // This can also be used
    println(listFromArray)
}