/*
Math Magic
==========

Up until this point, you were a Kotlin developer in training. For this project, you’ll take on another role and become a mathemagician 🧙‍♂️

We’ll build a program that determines a user’s age using our knowledge of fundamental Kotlin concepts and arithmetic operations. Take a peek at the solution code at the end of the project if you’d like to check your answers.
 */
fun main() {

    //Variable Declarations

    println("What's your name?")
    val userName = readLine()

    println("What's your age?")
    val age = Integer.valueOf(readLine())
    val firstDigit = age / 10
    val secondDigit = age % 10

    //Abracadabra 🧙‍♂️

    var magicNum : Int

    magicNum = firstDigit * 5
    println("\nYour age first digit multiplied by 5: $magicNum")

    magicNum += 3
    println("Now let's add 3: $magicNum")

    magicNum *= 2
    println("Multiply by 2: $magicNum")

    magicNum += secondDigit
    println("Now we're adding your age's second digit: $magicNum")

    magicNum -= 6
    println("Substract 6: $magicNum")

    println("\n$userName's age is $magicNum.")
}