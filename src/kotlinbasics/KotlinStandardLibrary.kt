package kotlinbasics
/*
Kotlin Standard Library -> -> https://kotlinlang.org/api/latest/jvm/stdlib/

Default imports in kotlin are -
kotlin.*
java.lang.*
(That's why imports not needed for basic classes like Array, String, printnl)
*/

/*
Variable Declarations -
Kotlin uses type inference.meaning compiler can infer the type of the variable, and this is done at compile time.
Kotlin is a statistically typed language so types are known at compile time.
 */


fun main(args: Array<String>){
    println("test")

    val number: Int
    val number1 = 24
    print(number1)


    // To assigne variable type as short, tell compiler explicitly
    val shorty: Short = 25
    print(shorty)

    // Vals cannot be reassigned but var variables can be
    val test = 21
//    test = 21  // Gives error -> Val cannot be reassigned

    var mutable = 10
    print(mutable)
    mutable = 11
    print(mutable)

    // If a variable name is underlined, it means it is a mutable variable
    // Kotlin Recommends that you declare val or immutable variable, it is not forced but recommended practice.


    // Example with Class showing - If a variable is immutable it doesn't mean that instance properties are immutable
    // Here employee class instance is immutable but it's instance properties are mutable

    val employee1 = Employee("Lynda Jones", 232)
    println(employee1.name)

    employee1.name = "Lynda Smith"

    println(employee1.name)


    // You can't change datatypes of var variables
    var canWeChangeDataType = 25
//    canWeChangeDataType = "no"//  Error -> Type mismatch required int Found String


}

class Employee(var name: String, val id: Int)