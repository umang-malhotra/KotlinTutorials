package kotlinOO

fun main(){
    /***
     * using constuctor (called primary constructor) in class defination allows you to add properties to the class
     * But same has to be initialized in init block
     *
     * Can declare other consturctors as well like in Java, and they are called secondary constructor
     *
     * init block is not a constructor it runs when an instance is created, and it is used in conjunction with the
     * primary constructor
     */

    val empl = Employee("neen")
    println(empl.firstName)

    val emp2 = Employee2("jignesh")
    println(emp2.firstName)


    /***
     * All secondary constructors calls have to go through primary constructor
     * Secondary constructors do not declare properties in the class for us (by using val/var), only primary constructors
     * does that.
     * Since kotlin does not want null pointer, properties without declaring their initial values won't be possible
     */
    val internEmployee = Employee5("Ramu", false)
    println(internEmployee.fulltime)

    /**
     * Is there a more elegant way to do the Employee5 class?
     * Yes, Employee6 class
     */

    /**
     * You can have secondary constructor without primary constructor, Eg - Employee7 Class
     */


}

class Employee constructor( firstName: String){
    val firstName: String
    init {
        this.firstName = firstName
    }
}
/***
 * Above implementation can be shortened as follows -
 */

class Employee1 constructor( firstName: String){
    val firstName: String = firstName
}

/***
 * In Kotlin, we can remove the boiler plate code of property assignnments, by declaring the variable in
 * primary constructor as val or var.
 */

class Employee2 constructor( val firstName: String){
}

/***
 * Next we can just remove the constructor keyword as well
 * Primary constructor thn will be public
 */
class Employee3 ( val firstName: String){
}

/***
 * If we have to change the visibility of the constructor , we gotta explicitly do that like below.
 *
 */

class Employee4 protected constructor(val firstName: String){}



class Employee5 (val firstName: String){
    var fulltime: Boolean = true
    constructor(firstName: String, fulltime: Boolean): this(firstName){
        this.fulltime = fulltime
    }
}

class Employee6 (val firstName: String, val fulltime: Boolean = true){
}

class Employee7{
    val firstName: String
    constructor(firstName: String){
        this.firstName = firstName
    }
}
