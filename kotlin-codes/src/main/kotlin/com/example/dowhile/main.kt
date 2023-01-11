package com.example.dowhile

import java.util.*

fun main() {

    val scan = Scanner(System.`in`)
    Locale.setDefault(Locale.US)

    var answer: Char

    do {
        print("Enter the temperature in Celsius: ")
        var tempC: Double = scan.nextDouble()
        var tempF: Double = 9.0 * tempC / 5.0 + 32.0

        println("Equivalent in Fahrenheit: %.1f".format(tempF))
        println("Want to repeat? (y/n)? ")
        answer = scan.next().single()
    } while (answer != 'n')

    scan.close()

}