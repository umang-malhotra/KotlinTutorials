package KotlinDataTypes

import helper.javaCode.Dummy
import java.math.BigDecimal

// Arrays is actually a collection
fun main(args: Array<String>) {
    val names = arrayOf("Jane", "Joe", "Jill")
    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3)

    println(longs2 is Array<Long> )

    println(names[1])

    /** Array constrcutor for initializing array (by passing lambda) - */

    val evenNumbers = Array(4){i -> i*2}
    val numbers = Array(100){i->i+1}


    for(number in evenNumbers) {
        println(number)
    }
    println()

    val allZeroes = Array(8){ i -> 0}
    /** Above can be written as follows :- */
    val allZeroes2 = Array(8){0}

    for(number in allZeroes2) {
        println(number)
    }

    /** We can mix datatypes in Arrays */

    val mixedArray = arrayOf("hello" , 21, 21L, BigDecimal(21), 'a')
    println(mixedArray is Array<*>)


    println()
    /** How to call Java Code from Kotlin which accepts primitive types instead of reference types */

    val referenceArray = arrayOf(12, 13, 14, 15)
    // Dummy().printNumbers(referenceArray) gives errors

    // Way 1
    val primitiveArray = intArrayOf(12, 13, 14)
    Dummy().printNumbers(primitiveArray)

    // Way 2
    Dummy().printNumbers(evenNumbers.toIntArray())

    /** Primitive Type array to typed array conversion */
    val typedArray: Array<Int> = primitiveArray.toTypedArray()
}
