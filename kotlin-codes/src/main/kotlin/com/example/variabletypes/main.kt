package com.example.variabletypes

fun main() {
    // Types of variables
    var age = 27
    var idade: Int = 27
    println(age)

    var valuePi = 3.14F
    var valorPi: Float = 3.14F
    println(valuePi)

    var salary = 1750.90
    var salario: Double = 1750.90
    println(salary)

    var serialNumber = 458724187L
    var numeroSerie: Long = 458724187L
    println(serialNumber)

    var letter = 'a'
    var letra: Char = 'a'
    println(letter)

    var name = "Daniela"
    var nome: String = "Daniela"
    println(name)

    var test = true
    var teste: Boolean = true
    println(test)

    // Constant
    val LOVE: String = "Infinite"
    val PI: Double = 3.14
    println(LOVE)
    println(PI)

    // Unsigned (variable that contains no negative values)
    // NOTE: Unsigned only works on integer types
    val exe01: UByte = 15u
    val exe02: UShort = 15u
    val exe03: UInt = 15u
    val exe04: ULong = 15u
}