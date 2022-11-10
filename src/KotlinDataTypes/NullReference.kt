package KotlinDataTypes

import helper.javaCode.Dummy

/***
 * Kotlin has been designed to make it difficult to get null pointer exceptions
 *
 * In kotlin if you want to declare a variable that can take Null values, you have to explicitly tell the compiler
 *
 * val myString: String = null <- Will throw error
 * val myString: String? = null <- works just fine
 */
fun main(args: Array<String>){
    val str: String? = "This is a non null string" // null

    /**Compiler starts giving an error on a bunch of methods in String class as soon as we declared it as nullable
     * using ? in String?
     * This can be overcome by using if condition, compiler remembers if variable is null as was done in smart cast*/
    // str.toUpperCase()
    //str.length

    if(str != null){
        val str1 = str.toUpperCase()
    }

    /** If an object can be null, than kotlin enforces null check before doing anything on the object
     * Above null check can be shorthanded as follows by using safe operator */
    val str1 = str?.toUpperCase() /** This does the same as above, if the null check passes on str than only calls the uppercase method*/

    println(str1)

    /** Elvis Operator - */
    /** We can assign the default value to a non nullable object if an object is null */

    val sttr: String = str ?: "Default value"
    println(sttr)

    /** Safe cast  operator as? */
    val something: Any = arrayOf(1, 2, 3, 4)
    val stttrr: String? = something as? String
    println(stttrr)

    ////////////// Part 2 ///////////////////




}