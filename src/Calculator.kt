/*
Codey's Calculator
==================

Codey’s made it to DevCity: a place full of Android applications, web development, and other endless implementations of the Kotlin language!

In this project, we’ll utilize our knowledge of Kotlin classes to help Codey build a basic calculator application that many of us have built-into our smartphones.

Our calculator will be able to:
Find the sum +
Find the difference -
Find the product ✕
Find the quotient ÷
Find the power ＾
 */

// Create a Class
class Calculator(val name: String) {
    init {
        println("$name's Calculator 🧮")
    }

    fun add(num1: Int, num2: Int) = num1 + num2

    fun subtract(num1: Int, num2: Int) = num1 - num2

    fun multiply(num1: Int, num2: Int) = num1 * num2

    fun divide(num1: Int, num2: Int): Any {
        return if (num2 == 0) {
            "You can't divide by zero."
        } else {
            num1.toDouble() / num2.toDouble()
        }
    }

    fun power(num1: Int, num2: Int): Long {
        var result: Long = 1
        for (i in 1 .. num2){
            result *= num1
        }
        return result
    }
}

fun main() {
    // Get to Calculating
    val calculator = Calculator("Codey")

    println("Please enter 2 numbers:")
    val x = Integer.valueOf(readLine())
    val y = Integer.valueOf(readLine())

    println("$x + $y = ${calculator.add(x,y)}")
    println("$x - $y = ${calculator.subtract(x,y)}")
    println("$x * $y = ${calculator.multiply(x,y)}")
    println("$x / $y = ${calculator.divide(x,y)}")
    println("$x ^ $y = ${calculator.power(x,y)}")
}