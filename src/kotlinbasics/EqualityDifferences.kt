package kotlinbasics

import helper.Employee1

// In Java == checks for referential equality. It is true when both objects are same
// In Java .equals method on an object checks for the structural equality with another object. It is true if considered
// members of class objects are equal. We can write the equals method accordingly as well
// While In Kotlin, we have === for referential equality and == for structural equality. == actualy calls the .equals method on object
// as shown in below example

// To iterate == in Java is referential equality, In kotlin it is structural equality
fun main(args: Array<String>) {
    println("test")

    val employee1 = Employee1("Umang", 1)
    val employee2 = Employee1("Umesh", 1)
    val employee3 = Employee1("Umesh", 1)

    println(employee1 == employee2)
    println(employee2 == employee3)


    println(employee1 === employee2)
    println(employee2 === employee3)
}