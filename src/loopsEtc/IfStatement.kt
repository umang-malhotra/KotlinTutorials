package loopsEtc

fun main(){
    /**
     * If can evaluate to a value in Kotlin
     */

    val someCondition = "b" in "a".."e"

    val num = if(someCondition) 42 else 24
    println(num)

    // Usual if conditions are also valid

    if(someCondition){
        println("someCondition is true")
    } else {
        println("someCondition is false")
    }

    println("If statement working as expression - ")
    println("The result of if expression is ${if(someCondition){
        println("someCondition is true")
        true
    } else {
        println("someCondition is false")
        false
    }}")
}