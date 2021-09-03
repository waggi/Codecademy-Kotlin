/*
Self-Grading Quiz
Working at a school that has recently switched to e-learning tactics, you have been assigned the task of creating a self-grading quiz program for the math class.

Using your knowledge of Kotlin and conditionals, you will create a program that collects and checks a student’s answers and then gives them a final letter grade.
 */
fun main() {
    val quizAnswer1 = 15
    val quizAnswer2 = 3
    val quizAnswer3 = "isosceles"
    val quizAnswer4 = 47

    // Creating Quiz Questions

    println("What is 75 / 5?")
    val studentAnswer1 = Integer.valueOf(readLine())

    println("What is the value of 'y' in the equation: 6 * 2y = 36?")
    val studentAnswer2 = Integer.valueOf(readLine())

    println("Please name the type of triangle that has two equal sides.")
    val studentAnswer3 = readLine()

    println("What is the vale of 8 * 6 - (3 - 2)?")
    val studentAnswer4 = Integer.valueOf(readLine())

    // Grading the Quiz

    var points = 0

    // Question 1
    if (studentAnswer1 == quizAnswer1) points += 25

    // Question 2
    when (studentAnswer2) {
        quizAnswer2 -> points += 25
        quizAnswer2 + 1, quizAnswer2 - 1 -> {
            points += 20
            println("The answer $studentAnswer2 is within 1 point of $quizAnswer2.")
        }
        else -> points += 1
    }

    // Question 3
    points += when (studentAnswer3) {
        quizAnswer3 -> 25
        "equilateral" -> 10
        else -> 1
    }

    // Question 4
    points += when (studentAnswer4) {
        quizAnswer4 -> 25
        in 44..54 -> 20
        else -> 1
    }

    // Returning a Final Grade

    when (points) {
        in 0..59 -> println("You've got $points points, your grade is F")
        in 60..69 -> println("You've got $points points, your grade is D")
        in 70..79 -> println("You've got $points points, your grade is C")
        in 80..89 -> println("You've got $points points, your grade is B")
        in 90..100 -> println("You've got $points points, your grade is A")
        in 101..110 -> println("You've got $points points, your grade is A+")
    }
}