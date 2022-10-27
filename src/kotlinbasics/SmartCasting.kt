package kotlinbasics

import helper.Employee1

/***
 In java we check if an object is of the particular class by `instanceof`
 In kotlin we check by `is`

 Casting in Kotlin is done by `as`
 As soon as we do an is check , we can treat the variable as it has been cast
***/
fun main(args: Array<String>){
    val something: Any = Employee1("Umang", 1)

    println(something is Employee1)
    println(something !is Employee1)

    if(something is Employee1){
        val castedVariable = something as Employee1

        println(something.name)
        println(castedVariable.name)
    }

}