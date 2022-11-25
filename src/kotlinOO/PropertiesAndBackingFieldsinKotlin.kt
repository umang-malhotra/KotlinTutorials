package kotlinOO

fun main(){
    /**
     * When we declare a property either using primary constructor or explicitly, kotlin create default accessors for us
     * getters and setters
     * For public properties in Kotlin , you get the getters and setters (for var)
     */


    class Employee(val firstName: String, var fullTime: Boolean = true) {
    }
    val empJohn = Employee("John")
    println(empJohn.fullTime)

    empJohn.fullTime = false
    println(empJohn.fullTime)

    /***
     * In kotlin, getters and setters have to have the same visibility
     * (access modifier) as the property or a less permissive visibility.
     *
     * So you can't modify a private field from outside in kotlin
     */

    /***
     * If you want to declare your own getters and setters, you won't write the property in the primary constructor
     * You have to write custom get / set immediately after the property declaration
     *
     * field here is called backing field / identifier
     */


    class Employed(val firstName: String, fulltime: Boolean = true) {
        var fulltime  = fulltime
            get() {
                println("Running inside get of fulltime")
                return field
            }
            set(value) {
                println("Inside set")
                field = value
            }
    }
    val ee = Employed("Mini")
    ee.fulltime = false
    println(ee.fulltime)







}

