package kotlinOO

fun main(){
    /***
     * Mostly Similar to enums in Java.
     * Can add properties as well as in Java
     *
     * Can also add functions in enums
     * Have to add ; after adding all enums and before writing a function definition
     *
     */

    println(Department.HR.getDepartmentInfo())
}

enum class Department(val fullName: String, val numOfEmployees: Int) {
    HR("Human Resource", 3), IT("Information Technology", 5),
    ACCOUNTING("Accounting", 12), Tech("Technology", 20);

    fun getDepartmentInfo(): String = "The $fullName deparment has $numOfEmployees Employees"
}