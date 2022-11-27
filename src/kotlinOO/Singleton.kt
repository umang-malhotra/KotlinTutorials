package kotlinOO

import java.time.Year

fun main(){
    println("hello")

    /**
     * An object declaration declares and creates the object at the same time.
     * Adding constructors to it wouldn't make sense
     *
     */

    println(CompanyCommunication.getCopyLine()) // This is when singleton is created
    println(CompanyCommunication.getTagLine())

    /**
     * Object classes can extend other classes and can implement interfaces
     */

}

object CompanyCommunication{
    val currentYear = Year.now().value

    fun getCopyLine() = "This is company Copy Line @ copyright - Year - $currentYear"

    fun getTagLine() = "This is Compnay Tag Line"
}