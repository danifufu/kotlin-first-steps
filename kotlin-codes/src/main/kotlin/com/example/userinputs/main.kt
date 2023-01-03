package com.example.userinputs

import java.util.Scanner // import Scanner class from Java standard library

fun main() {

    val scan = Scanner(System.`in`) // create Scanner object

    // Reading a specific type of input
    // STRING
    val str1: String = scan.nextLine()
    val str2 = readLine()

    // CHAR
    val letter: Char = scan.next().single()

    // INT
    val age: Int = scan.nextInt()

    // DOUBLE
    val height: Double = scan.nextDouble()

    // FLOAT
    val money: Float = scan.nextFloat()

    // BYTE
    val num: Byte = scan.nextByte()

    // BOOLEAN
    val question: Boolean = scan.nextBoolean()

    // Reading a simple input
    print("Enter your name: ")
    val name: String = readln()
    // val name: String = readLine()!!

    println("Hello, $name!")

}