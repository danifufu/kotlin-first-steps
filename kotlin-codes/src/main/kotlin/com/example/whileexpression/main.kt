package com.example.whileexpression

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    print("Enter integer numbers: ")
    var num: Int = scan.nextInt()
    var sum: Int = 0

    while (num != 0) {
        sum += num
        num = scan.nextInt()
    }

    println("Sum = $sum")

    scan.close()

}