package com.example.whenexpression

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)

    val x: Int = scan.nextInt()
    val day: String

    day = when (x) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Invalid value"
    }

    println("Day of the week: $day")
    scan.close()
}