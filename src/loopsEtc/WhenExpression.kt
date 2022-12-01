package loopsEtc

enum class Season {
    WINTER, SUMMER, SPRING, FALL
}
fun main(){
    /**
     * When statement is equivalent of swith statement in Java
     */

    val num = 200

    when(num) {
        100 -> println("val is 100")
        200 -> println("val is 200")
        300 -> println("val is 300")
        else -> println("doesn't match anything")
    }
    // Can have multiple values and can also add ranges

    when(num ) {
        100, 200 -> println("Either 100 or 200")
        in 100 .. 500 -> println("in range 100 . . 500")
        else -> println("inside else")
    }

    // Only 1st match is executed, break is their by default behind the scenes in JVM compiler, as seen above

    //When for matchin enums -
    val timeOfTheYear = Season.WINTER

    val someReturnedValue = when(timeOfTheYear) {
        Season.SUMMER -> {
            println("It's summer time")
            "March-August"
        }
        Season.WINTER -> {
            println("It's the most wonderful time of the year")
            "December-January"
        }
        else -> "something else"
    }
    println(someReturnedValue)



    // When can be used as if-else
    val num1 = 10
    val num2 = 100

    when {
        num1 < num2 -> println("smaller")
        num1 > num2 -> println("greater")
        else -> println("equal condition")
    }

}