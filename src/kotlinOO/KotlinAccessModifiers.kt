package kotlinOO

fun main(args: Array<String>) {
    println("TBD")

    /***
     * In java only classes can be top level items, but for kotlin functions can as well.
     * Top Level items are public by default, it's different from java, because for Java top level visibility which
     * is for Classes is Package private.
     *
     * Private keyword if for visiblity in same file.
     *
     * If a class is public, than it's name has to match the class name in which it lives. In kotlin you  can
     * have as many public classes as you want because there is no requirement for matching name of file and class
     *
     * In Java private class is not possible, because nothing will be ever able to see that class. But in kotlin
     * you can use private with classes, so everything in the file can see that class.
     *
     */

    val privateClassTest = PrivateClassTest()

    println(privateClassTest)

    /***
     *
     * In java a class is package private unless specified public
     * Kotlin has a notion of module,
     * A module is a group of files that are compiled together and in IntelliJ access-modifiers is a module
     * but it could be a group of files compiled by gradle or maven
     *
     * Access Modifier - Internal
     * A top level item that is marked internal is visible inside the module.
     *
     */

    /***
     *
     * For Top Level Items
     * Access Modifier              Kotlin                    Java
     * private               visible within same file     can't be used
     * protected            can't be used                 can't be used
     * public               visible everywheree           visible everywhere
     * internal             visible within smae module      N/A
     *
     *
     * For class members there are following access modifiers in both Kotlin and Java, which have same behaviour in both
     * public, private and protected
     * Apart from that kotlin also has internal
     *
     * Difference -
     * In kotlin classes can't see private methods belonging to inner classes.
     *
     */

    /***
     * Anomalies when mix kotlin and Java -
     * Under the covers, In JVM
     * Private in kotlin is compiled to package private in java bytecode
     * Internal in kotlin is compiled to public in Java bytecode.
     * Visiblities are then managed at runtime by kotlin.
     *
     * Next Internal variables which were only supposed to be visible in same module in kotlin, can be visible
     * in a Java class, because they are actually public, and there is nothing like internal in java
     */

}

private class PrivateClassTest{
    override fun toString(): String {
        return "This is from PrivateClassTest"
    }
}