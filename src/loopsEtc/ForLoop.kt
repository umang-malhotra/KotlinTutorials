package loopsEtc

fun main(){
    /**
     * Kotlin has for loop for in Range
     *
     * What is a range?
     */

    val intRange = 2..10
    val charRange = 'a'..'z'
    val stringRange = "ABC".."ZZZ"

    println(4 in intRange)

    println("ZZZZZZ" in stringRange)

    // Backward Range, with steps of 2 example
    val reveseNumbers = 10.downTo(1).step(2)
    for(n in reveseNumbers) print(n.toString() + " ")

    println(charRange.reversed())

    /**
     * You can create ranges with any comparable types
     */

    for(num in 1..100 step 4) print(num.toString() + " ")

    for(num in 20 downTo 15) print(num.toString() + " ")

    // Use until keyword for iterating to number exclusive
    println()

    for(num in 1 until 5) print(num.toString() + " ")

    // Loop around a String ---
    for (c in "Austin") println(c)

    // Loop over array -
    val searsonArray = arrayOf("Winter", "Summer", "fall", "spring")
    for(season in searsonArray){
        print("$season ")
    }
    println("snowing" !in searsonArray)

    for (index in searsonArray.indices){
        print(" ${searsonArray[index]} ")
    }
    println("Iterating with Lambda -- ")
    searsonArray.forEach { print(" $it") }

    searsonArray.forEachIndexed { index, value -> println("$value is at season number $index")  }
}