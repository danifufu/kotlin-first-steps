package com.example.arrays

fun main() {

    // a simple array of Strings
    var names = arrayOf("Daniela", "Melissa", "Angelica")
    println(names[1])

    // modifying/replacing an array element
    names[2] = "Fernanda"
    println(names.contentToString())

    // an array can contain elements of different types
    var arr = arrayOf("Daniela", 1520, 3.55)
    println(arr[2])

    // defining a specific type for the array (int)
    var numbers = intArrayOf(10, 20, 30, 40, 50)
    println(numbers[3])

}