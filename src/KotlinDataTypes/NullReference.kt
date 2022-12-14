package KotlinDataTypes

import helper.javaCode.Dummy
import java.lang.Exception
import java.lang.NullPointerException as exception

/***
 * Kotlin has been designed to make it difficult to get null pointer exceptions
 *
 * In kotlin if you want to declare a variable that can take Null values, you have to explicitly tell the compiler
 *
 * val myString: String = null <- Will throw error
 * val myString: String? = null <- works just fine
 */
fun main(args: Array<String>) {
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

    println("------------")
    ////////////// Part 2 ///////////////////
    /***
     * Not Null Assertion operator -> !!
     * In safe call you won't get a null pointer exception, but if you want to get a null pointer exception
     * you can use !! operator (Not Null Operator), You are 99 % sure variable won't be null, but if it is null
     * YOu will get a null pointer exception
     */

    val nullableString: String? = "this is no null" // null
    val str2 = nullableString!!.toUpperCase()

    println(str2)
    
    /**Not null assertion is a shortahand for following */
//    if(nullableString == null){
//        throw exception
//    } else {
//        nullableString.toUpperCase()
//    }

    /**
     * In case of a Null Pointer exception , the exception occurs at live where we made not null assertion on a variable
     * So it's not a good idea to chain !! assertions like we do in safe operator, because you won't know which one was
     * actually null
     * Eg -> in bankCode!!.countrycode!!.address, you won't know if bankCode is null or countrycode is null
     * */


    /***
     * Nullable and non nullable types are actually distinct types.
     * Eg String? and String are distinguishable types
     */

    val newStr: String? = "some string"
    fun printText(text: String) {
        println(text)
    }


    // Solution #1 -> Using Not Null assertion
    printText(newStr!!)

    // Above solution can throw exception at the time of assertion if variable is null
    // Solution #2 - Use let
    if(newStr !=null) {
        printText(newStr)
    }

    // If newStr is not null then let it print
    newStr?.let{ printText ( it ) }

    // The let function uses the parameter that calls it to pass it inside the lambda

    /***
     * Equals operator is a safe operator
     */
    val someNewStr: String? = null
    val anotherStr = "Not null str"

    someNewStr.equals(anotherStr)












}