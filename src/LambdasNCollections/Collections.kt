package LambdasNCollections

fun main() {
    val seasons = listOf("Winter", "summer", "Autumn", "Spring")
    val colors = listOf("White", "Green", "Orange")
    val ints = listOf(1, 3, 7, 5)
    println(colors.last())

    // Max in list of int
    println(ints.max())

    // Reversing a list
    println(colors.asReversed())
    // Accessing with condition
    println(seasons.getOrNull(4))

    // Merging Lists
    val combinedList = colors + seasons
    println(combinedList)

    val combinedList2 = colors + colors
    println(" combinedList2 " + combinedList2)
    println(" Union on same list - "  + colors.union(colors))

    println(" Distinct List  " + combinedList2.distinct()) // Distinct function returns a new list, instead of working on same list

    val mutableList = seasons.toMutableList()
    mutableList.add("New Season")
    println(mutableList)
}