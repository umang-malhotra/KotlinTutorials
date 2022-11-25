package kotlinOO

fun main(){

    val someThing = someThing("huehue")
    println(someThing.someProperty)

    /**
     * We can add concrete property in interfaces by adding that in get method
     */

    /***
     * Properties in interfaces don't have backing fields in setters and getters, as opposed to classes
     */
}

interface myInterface{
//    val property: Int = 45 Error - Property Initializers are not allowed in interface
    val property: Int
        get() = 45
    fun myFunction(str: String): String
}

interface mySubInterface: myInterface{
    fun mySubFunction(num: Int): String
}

open class someThing: mySubInterface{
    override val property = 46
    var someProperty: String
    constructor(someParam: String) {
        someProperty = someParam
    }

    override fun mySubFunction(num: Int): String {
        TODO("Not yet implemented")
    }

    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }

}