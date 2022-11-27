package kotlinOO

fun main(){
    /***
     * Kotlin does not have static keyword
     * In java you can access static members, without instantiating an instance of the class.
     *
     * In kotlin,
     * You place the function in the "companion object".
     * You can then access the members in companion object without instantiating the class

    So the java code like this:

    class Foo {
    public static int a() { return 1; }
    }
    will become

    class Foo {
    companion object {
    fun a() : Int = 1
    }
    }
    You can then use it from inside Kotlin code as

    Foo.a();
    But from within Java code, you would need to call it as

    Foo.Companion.a();
    (Which also works from within Kotlin.)

    If you don't like having to specify the Companion bit you can either add a @JvmStatic annotation or name your companion class.

    From the docs: https://kotlinlang.org/docs/object-declarations.html#companion-objects
     */


    println(SomeClass.accessPrivateVar()) // Equivalent Situation of Java Static member referencing

    println(SomeClass.accessPrivateVar())

    /**
     * Companion objects can also be given name, and then can  be accessed via names
     */

    /**
     * Another use of companion objects is to call private constructors
     Infact they can be used to implement factory pattern

     */

    val myUdemy = Udemy.justAssign("Expedia Organization Udemy")
    val myLowerCaseUdemy = Udemy.upperOrLowerCaseUdemy("This some Random Course", false)
    println(myUdemy.someString)
    println(myLowerCaseUdemy.someString)

    /**
     * Here private constructor won't be accessible from outside.
     * So we have imposed factory pattern, to instantiate a class
     * We are needing to call factory methods
     */

}

class SomeClass {
    companion object {
        private var privateVar: Int = 66

        fun accessPrivateVar(): String = "I am accessing privateVar - $privateVar"
    }
}

class Udemy (val someString: String){
    companion object{
        fun justAssign(str: String) = Udemy(str)

        fun upperOrLowerCaseUdemy(str: String, isLower: Boolean) : Udemy {
            return if(isLower){
                Udemy(str.toLowerCase())
            } else {
                Udemy(str.toUpperCase())
            }
        }
    }
}