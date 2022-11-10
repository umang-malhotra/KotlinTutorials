package KotlinDataTypes

fun main(args: Array<String>){
    var myLong: Long = 22L
    print(myLong.javaClass)

    // In Kotlin you can't typecast one type to another but you have to call the method

    var myInt: Int = 12

    myLong = myInt.toLong()

    println(myLong)

    var myShort: Short
    myShort = myInt.toShort()
    print(myShort)

    /////////////////////////////////
    // Values are not automatically widened to different datatype , but have to explicitly widened using
    // methods like .toLong() .toDobule()

    val myDouble = 64.553
    println(myDouble is Double)


    val myFloat = 543.234f
    println(myFloat.javaClass)

    /*** To Get ASCII Character value of an Integer use .toChar() */
    val myCharInt = 65
    val myChar = myCharInt.toChar()
    println(myChar)

    val myBoolean = false
    println(myBoolean.javaClass)


    /** Any, Unit and Nothing classes in Kotlin */
    /***
     * Any class is sort of Object class in Java, i.e. root of all kotlin object
     * Any class has implementations for equals, hashCode and toString methods available
     */

    val someAny: Any

    /***
     * Unit class is equivalent to void in Java, void isn't a datatype.
     * it's a way to tell the compiler that a method doesn't return anything
     * Kotlin uses Unit for this purpose. Unit is actually a singleton object.
     * So in Java nothing is return out of a method with void return type, but Kotlin returns ans object which is Unit
     */


    /***
     * Nothing is a subclass of everyclass
     * Usecase -> When a function never completes (eg infinite loops), so it will declare Nothing as returntype
     */





}