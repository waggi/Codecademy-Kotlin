/*
Shape Maker
===========

How many output statements do you need to draw two-dimensional shapes? Using loops, the answer to this question is 2. In this project, you will create a square and a triangle of any size using nested loops with one print() statement and one println() statement.

We’ll create a basic square pattern using loop concepts we covered in the previous lesson. We’ll even take it a step further by getting our program to output a checkerboard pattern.

Then, we’ll explore how nesting a while loop inside of a for loop can be used to create a triangle pattern in the output terminal. This will give us a different perspective of nested loops and how to control variables when using while loops.
 */
fun main() {
    // Square Variables
    val sqSide = 7
    val sqChar1 = "X  "
    val sqChar2 = "O  "

    // Creating a Square Pattern
    println("Square Pattern:")
    for (i in 1..sqSide) {
        for (j in 1..sqSide) {
           print(sqChar1)
        }
        println()
    }

    // Creating a Checker Board Pattern
    println("Checker Board Pattern:")
    for (i in 1..sqSide) {
        for (j in 1..sqSide) {
            if (i % 2 == 0 && j % 2 == 0 || i % 2 != 0 && j % 2 != 0) {
                print(sqChar1)
            } else print(sqChar2)
        }
        println()
    }

    // Triangle Variables
    val triRows = 10
    var triCount = 0
    var triRowLen = triRows
    val triChar1 = "/  "
    val triChar2 = "   "

    // Creating a Triangle Pattern
    println("Triangle Pattern:")
    for (i in triRows downTo 1) {
        while (triCount < triRowLen) {
            print(triChar1)
            triCount++
        }
        println()
        triCount = 0
        triRowLen--
    }

    // Creating a Triangle Outline Pattern
    triCount = 0
    triRowLen = triRows

    println("Triangle Outline Pattern:")
    for (i in triRows downTo 1) {
        while (triCount < triRowLen) {
            triCount++
            if (triCount == 1 || triCount == triRowLen || i == triRows) {
                print(triChar1)
                continue
            }
            print(triChar2)
        }
        println()
        triCount = 0
        triRowLen--
    }
}