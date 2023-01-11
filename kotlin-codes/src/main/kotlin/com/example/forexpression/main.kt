package com.example.forexpression

fun main() {

    // increment from 1 to 1
    for (i in 0..5) {
        println("Counter i = $i")
    }

    // increment from 2 to 2
    for (i in 0..10 step 2) {
        println("Counter i = $i")
    }

    // decrement from 1 to 1
    for (j in 5 downTo 0) {
        println("Counter j = $j")
    }

    // decrement from 2 to 2
    for (j in 10 downTo 0 step 2) {
        println("Counter j = $j")
    }

    // another example with FOR
    val numArray = intArrayOf(10,20,30,40,50)
    for (i in numArray.indices) {
        println("At index $i is ${numArray[i]}")
    }

}