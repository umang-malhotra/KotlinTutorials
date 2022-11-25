package kotlinOO

fun main(){
    /***
     * Everything in kotlin is public and final by default.
     * Which mean class (which is final) won't be able to be extended.
     * So we add open keyword, so that it can be extended by some other class
     */


    val mvc = MotorVehicle("Brother 1223", 11)
    mvc.printModal()

    /***
     * In order to override function in subclass, we needed to make function in superclass open
     */

    /***
     * Override also means open, so if you override a member, subclasses can override that member too
     * You will have to use final keyword, if you don't want to let it override
     */

    /***
     * You can't call a super secondary constructor , If you have a primary constructor, because every constructor has
     * to delegate to primary constructor
     * // Read more
     */

    /***
     * Data classes can't be open / abstract and can't be extended. They can extend other classes
     */

}

open class Printer{

}
// We have to create a constructor which calls super constructor of the upeer class
class LaserPrinter: Printer{
    constructor(): super()
}

// Same can be done as-
class LaserPrinter1(): Printer(){
}


// Eg with property -
// open keyword is redundant with abstract keyword, because abstract class will have to be extended
abstract class Vehicle(val modelName: String){
    open fun printModal() = println("Modal name of thie vehicle is $modelName")
    abstract fun bestSellingPrice(): Double
}

class MotorVehicle(modelName: String, pollutionGrant: Int): Vehicle(modelName){
    override fun printModal() = println("Modal name for this motorvehicle is $modelName")
    override fun bestSellingPrice(): Double  = 12299.09
}