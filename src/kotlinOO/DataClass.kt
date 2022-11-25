package kotlinOO

val MY_CONSTANT = 121
fun main(){
    /***
     * In kotlin you can have top level constants, just like you have top leve functions.
     *
     * so you don't have to fill classes with constants
     */

    println(MY_CONSTANT)

    /**
     * Data classes are used, if the main purpose of the class is to store state
     *
     * Data classes comes with additional benefits
     * toStrings, equals and hashcodes, copy function
     *
     *  Data class Requirements - primary construtor has to have atleast one parameter.
     *  All the parameters in primary constructor has to be marked var or val
     *
     *  Data classes can't be abstract, sealed or inner classes
     *  With data classes you == evaluates to structural equality
     */

    val myCar = Car("Green", "23", 2022)

    println(myCar)

    /**
     * Copy function -
     */
    val myCar2 = myCar.copy()
    println(myCar2)
    println(myCar == myCar2)

    val myCar3 = myCar.copy(year = 2014)
    println(myCar3)
}



data class Car(val color: String, val model: String, val year: Int){

}