package com.example.mathfunctions

// it is necessary to use these libraries
import kotlin.math.min
import kotlin.math.max
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {

    // Square Root
    val x: Double = 3.0
    val y: Double = 4.0

    val a: Double = (sqrt(x))
    println("square root of a = $a")
    val b: Double = (sqrt(y))
    println("square root of b = $b")
    val c: Double = (sqrt(25.0))
    println("square root of c = $c")

    // Exponentiation
    val q: Double = 6.0
    val w: Double = 2.0

    val k: Double = q.pow(w)
    println("$q to the power of $w = $k")
    val l: Double = w.pow(2.0)
    println("$w to the power of 2.0 = $l")
    val m: Double = 5.0.pow(2.0)
    println("5.0 to the power of 2.0 = $m")

    // Absolute Value
    val j: Double = 4.0
    val g: Double = -5.0

    val s: Double = abs(j)
    println("absolute value of $j = $s")
    val z: Double = abs(g)
    println("absolute value of $g = $z")

    // Maximum and Minimum Value
    print("The maximum value between 5 and 10 is = ")
    println(max(5,10))

    print("The minimum value between 1 and 4 is = ")
    println(min(1, 4))

}