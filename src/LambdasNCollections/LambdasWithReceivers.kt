package LambdasNCollections

import java.lang.StringBuilder

fun main(){
    val employee = listOf(Employee("John", "Smith", 2002) ,
            Employee("Slack", "Slay", 2007),
            Employee("Third", "Wave", 2015)
    )


    /***
     * Checkout the with function at below
     * And apply function
     */
    println(countTo100())
    println(countTo100With())
    println(countTo100Apply())

    /**
     * Fool around with following -
     */

    // You can access, outer receivers using labels
    "Some String".apply someString@ { "Another String".apply {
        println(this.toUpperCase())
        println(this@someString.toLowerCase())
    } }
}

fun countTo100(): String{
    val number = StringBuilder()
    for(i in 1..99){
        number.append(i)
        number.append(", ")
    }
    return number.append(100).toString()
}

/**
 * With converts the instance that you passed to it into a receiver, and inside the lambda you don't have to refer
 * to the receiver object, but you cn with this keyword
 */
fun countTo100With(): String {
    return with(StringBuffer()) {
        for (i in 1.. 99){
            append(i).append(", ")
        }
        append(100)
        toString()
    }
}

/**
 * apply function is somewhat same as with function, but it always returns the receiver object
 */

fun countTo100Apply(): String {
    return (StringBuffer()).apply {
        for (i in 1.. 99){
            append(i).append(", ")
        }
        append(100)
    }.toString()
}


