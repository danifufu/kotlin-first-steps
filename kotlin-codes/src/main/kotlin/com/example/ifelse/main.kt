package com.example.ifelse

import java.util.Scanner

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    print("What time is it? ")
    val hour: Int = scan.nextInt()

    if (hour < 12) {
        println("Good morning!")
    } else if (hour < 18) {
        println("Good afternoon!")
    } else {
        println("Good evening!")
    }

    scan.close()


    // simplified IF and ELSE
    val age: Int = 15
    var verification = if (age >= 18) "old enough" else "not old enough"
    println(verification)

}