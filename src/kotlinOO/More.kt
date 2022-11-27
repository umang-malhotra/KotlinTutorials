package kotlinOO

import kotlinbasics.aTopLevelFunction

fun main(){

    /**
     * In kotlin you have toplevel functions.
     * So you import them the same way you import classes
     */


    println(aTopLevelFunction("aaaa..."))

    /**
     * What if we wanted to call this top level function from another Module?
     * For Example In NewModule, we are not able to import aTopLevelFunction
     * We will have to add the dependency in that module dependencies
     *
     * Right click Module, Open Module Settings, select the desired module. select dependency.
     * And the other module in dependency
     *
     * Check NewModule for few learnings
     */

    /**
     * Internal Modifier
     *
     * Properties declared with access modifier internal can't be seen in another module.
     */


}