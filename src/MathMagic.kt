fun main() {
    /*
     This program determines the user's age using an arithmetic magic trick.
    */
    println("What's your name?")
    val userName = readLine()

    println("What's your age?")
    val age = Integer.valueOf(readLine())
    val firstDigit = age / 10
    val secondDigit = age % 10

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