package com.example.prints

fun main() {

    // print (doesn't skip line)
    print("Hello World!")

    // println (skip line)
    println("Hello World!")

    // to print a variable inside a print, we need to use the $ symbol followed by the name var/val
    val name: String = "Daniela"
    val lastname: String = "Araujo"
    println("Welcome, $name $lastname!")

    // to print the result of an expression we use ${expression}
    println("What is the result of the sum? 2 + 2 = ${2 + 2}")

    // to call a function in print, use ${nameFunction(p1, p2)}
    val a: Int = 5
    val b: Int = 2

    println("Sum between $a + $b = ${sumOfTwo(a,b)}")

    // format, show formatted data
    val change: Double = 2.74638965
    val money: Double = 25.54793485

    println("Client change: $ %.2f de um total de $ %.4f".format(change, money))

    // writing something between quotation marks in a print
    println("\"something between quotation marks...\"")

    // writing a backslash in print
    println("1\\4")

    // skip a line
    print("above")
    print("\nbelow")

    // writing % in print
    val rabbits: Double = 25.49674535
    println("Percentage of rabbits: %.2f %%".format(rabbits))

    // writing $ in print
    val y = "\${2 == 5}"
    println("y = $y")

}

fun sumOfTwo(a: Int, b: Int) : Int {
    return a + b
}