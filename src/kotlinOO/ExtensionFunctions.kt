package kotlinOO

fun main(){
    /**
     * Let's say we want to add some utility function like upperFirstAndLast ,
     * Function which can modify the string to turn first and last letter into upper case.
     * Creating a utility class and adding this function there is usual.
     *
     * It is a String manipulation function, In kotlin we can add such function to String class itself.
     * It will be an illusion that such function is added to String class
     */
    val str = "this is all lowercase"
    println(upperFirstAndLast(str))

    println(str.upperFirstAndLast1())

    println(str.upperFirstAndLast2())
}
// Utility Function ---
fun upperFirstAndLast(str: String): String {
    return str.substring(0,1).toUpperCase() + str.substring(1,str.length-1) + str.substring(str.length-1, str.length).toUpperCase()
}

// Corresponding Extension Function on String class -
fun String.upperFirstAndLast1(): String {
    return this.substring(0,1).toUpperCase() + this.substring(1,this.length-1) + this.substring(this.length-1, this.length).toUpperCase()
}

// We can also remove this from above function, kotlin complier will still understand
fun String.upperFirstAndLast2(): String {
    return substring(0,1).toUpperCase() + substring(1, length-1) + substring(length-1, length).toUpperCase()
}