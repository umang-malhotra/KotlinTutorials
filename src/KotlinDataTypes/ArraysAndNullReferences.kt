package KotlinDataTypes

fun main(args: Array<String>){
    /***
     * When initializing Kotlin arryas, it requires a size and default values
     * Kotlin doesn't allow to initalize array of nulls
     */

    val nullableInts = arrayOfNulls<Int?>(5)

    for(nums in nullableInts){
        println(nums)
    }
}