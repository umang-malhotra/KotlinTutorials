package modulePackage

import kotlinOO.CompanyCommunication as Comm
import kotlinbasics.aTopLevelFunction


fun main(){
    println("Inside another module modulePackage")

    println(aTopLevelFunction("hello"))

    println(Comm.getCopyLine())
}