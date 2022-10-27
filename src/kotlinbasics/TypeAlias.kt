package kotlinbasics

typealias EmployeeSet = Set<Employee>

fun main(array: Array<String>){
//    print(array)

    // typealiases are alias for DataTypes

    val employeeSet: EmployeeSet = setOf(Employee("Umesh", 1), Employee("Umes2", 2))

    employeeSet.forEach {
        println(it.name)
    }

    // If you want to use this typealias EmployeeSet, you will have to import it in other classes
}