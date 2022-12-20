package LambdasNCollections

fun main(){
    /**
     * Lambdas in kotlin are have to be withing curly brces, you can also store them in variables.
     * But you can also call them directly via run
     *
     */
    run { println("I am  in a lambda") }

    /**
     * We often use lambdas with Collections
     */
    val employee = listOf(Employee("John", "Smith", 2002) ,
            Employee("Slack", "Slay", 2007),
            Employee("Third", "Wave", 2015)
    )

    // Find employee who joined first
    println(employee.minByOrNull ({ e -> e.startYear }))

    /**
     * You can move the lambda outside the parenthesis if this is last parameter of the function.
     * That means if you want your own function to take lamdba as parameter,
     * you would want to keep lambda in the last parameter, if you want to take it outside the function
     *
     * For eg function call -> customFunction(parameter, {lambda}) will be changed to customFunction(parameter) {lambda}
     */
    println(employee.minByOrNull { e -> e.startYear })

    // You might need to tell the compiler about type of the parameter if their are multiple params inside the lambda
    //     println(employee.minByOrNull{ e : String -> e.startYear })

    /**
     * When there is only one parameter and the compiler can infer the type, you can simply use `it` variable
     */

    employee.forEach{ println( it.firstName )}

    /**
     * Scoping:
     * Lambdas can access the local variables, as long as they are declared before the lambda
     */

    var num = 10
    run {
        num +=5 // it is mutable but still accessable from lambda, this is not possible in Java
        println(num)
    }

    // Member reference in lambda: Notice {} got replaced by (), not sure why
    employee.minBy(Employee:: firstName)

}
// With data class , we get the nice overwritten toString method
data class Employee(val firstName: String,val lastName: String, val startYear: Int)
