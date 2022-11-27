package kotlinOO

fun main(){
    var outSideVar: Int = 25
    doWithInterface(object : SomeInterface{
        override fun mustImplement(num: Int): String {
            outSideVar++
            return "This is from implementation of object - ${num*100}"
        }
    })

    println(outSideVar)

    /**
     * The instance used here is not singleton. Even though we used object keyword
     * It's used and then it's discarded
     *
     * Unlike Java, anonymous object can access the outside var variables.
     *
     */
}

interface SomeInterface{
    fun mustImplement(num: Int): String
}

fun doWithInterface(si: SomeInterface){
    println("From doWithInterface ${si.mustImplement(22)}")
}