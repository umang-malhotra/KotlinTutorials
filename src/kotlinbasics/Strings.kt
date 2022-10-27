package kotlinbasics

/***
 * `$` inside strings can be used to place the variable value inside String
 *
 *
 * Raw string is placed inside the triple quotes (“””….”””) and it does not have escape characters.
 * It provides the facility of writing the string into multiple lines
 * Use case -> File path, multiline string
 *
 * trimMargin function no raw string will trim everything upto margin character default is tab
 */
fun main(args: Array<String>){
    val integer = 420
    println("Integer above is $integer")
    println("Integer above is \$integer")

    println("""This is a raw String It does not takes escape characters like \$integer into account""")
    println("c:\\Users\\Directory\\FIle")

    println("""c:\Users\Directory\File""")


    println("""Humpty Dumpty sat on a wall,
Humpty Dumpty had a great fall;
All the king's horses and all the king's men
Couldn't put Humpty together again.""")


    println("-------------------------------------------")
    println("""Humpty Dumpty sat on a wall,
                @Humpty Dumpty had a great fall;
                @All the king's horses and all the king's men
                @Couldn't put Humpty together again.""".trimMargin("@"))


    // In java there is only one implementation of a specific string literal, so in Java
    // so they will be referentially equal

    val string1 = "hello"
    val string2 = "hello"
    println("Are these strings referentially equal? - ${string1===string2}")

    println("""|         1
        |        11
        |       111
    """.trimMargin("|"))

}