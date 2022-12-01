package loopsEtc

import java.lang.NumberFormatException

fun main(){
    /**
     * In kotlin try/catch can be used as an expression
     *
     * Note -> You don't need to write throws exception in kotlin
     * Because kotlin doesn't distinguish bw checked and unchecked exceptions
     *
     * The last block of the block will be the value of try/catch expression
     */

    println(parseStringToNum("22.43"))
    println(parseStringToNum("22"))

    //
}

fun parseStringToNum(str: String): Int {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException){
        0
    } finally {
        println("Inside finally block")
        // No value will be evver returned from finally block, it's going to be ignored
    }
}