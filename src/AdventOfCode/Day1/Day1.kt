package AdventOfCode.Day1

import java.io.File
import java.io.InputStream
import java.util.*

fun main(){
    println("hello")
    val inputStream: InputStream = File("src/AdventOfCode/Day1.txt").inputStream()
    val lineList = mutableListOf<String>()

    inputStream.bufferedReader().forEachLine { lineList.add(it) }
    lineList.forEach{println(">  " + it)}

}