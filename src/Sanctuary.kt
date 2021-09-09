/*
Animal Sanctuary
================

Did you know that chimpanzees share 95 to 98 percent of the same DNA with humans? Chimpanzees are some of the most intelligent, skillful, and remarkable animals on the planet and its paramount that we do everything in our power to protect and cherish their species.

For this reason, we are going to take a virtual trip over to Africa, home to many chimpanzees, and volunteer at an animal sanctuary where we’ll be taking special care of chimps. To do right by the chimps and be as successful as possible in our role, we decide to write a Kotlin program that will help us keep track of the chimps we’re caring for and our daily responsibilities.

We’ll have Bonnie, Jubilee, Frodo, and Foxie: 4 young chimpanzees in our care. Foxie is the youngest of the group so she will require some extra attention.

Our program will ensure that during our shift we’ve…

* Fed all the chimps
* Played a random game with them
* Conducted a health check on Foxie

 */
fun main() {

    // Preparing for the Day 📅

    val responsibilities = listOf("feed the chimps", "play a random game", "conduct a health check on Foxie")
    var responsibilitiesComplete = 0
    var timeSpent = 0
    val totalShiftTime = 4

    val foxiesHealthCheck = mutableMapOf<String, Any>()
    val chimpsHaveEaten = mutableMapOf("Bonnie" to false, "Jubilee" to false, "Frodo" to false, "Foxie" to false)

    println("Today's responsibilities:")
    val responsibilitySize = responsibilities.size
    repeat(responsibilitySize) { println("* ${responsibilities[it]}") }

    // Feeding the Chimps 🍎

    println("\nFirst, ${responsibilities[0]}:")

    chimpsHaveEaten.keys.forEach {
        println("Feeding $it...")
        chimpsHaveEaten[it] = true
    }

    responsibilitiesComplete += 1
    timeSpent += 1
    println("All chimps have now been fed! You've completed $responsibilitiesComplete / $responsibilitySize responsibilities.")

    // Playing a Random Game 🧩

    println("\nNext, ${responsibilities[1]}:")

    val games = setOf("tug-of-war with a blanket", "catch and throw", "number game")
    val randomGame = games.random()
    println("Let's play $randomGame.")

    responsibilitiesComplete += 1
    timeSpent += 1
    println("Each chimp has now played a game of $randomGame! You've completed  $responsibilitiesComplete / $responsibilitySize responsibilities.")

    // Conducting a Health Check 🌡

    println("\nNext, ${responsibilities[2]}:")

    val chimpNormalTemparature = 32.7
    var foxieTemperature = 32.5

    when {
        foxieTemperature in chimpNormalTemparature - 0.1 .. chimpNormalTemparature + 0.1 -> foxiesHealthCheck.put("temperature", "normal")
        foxieTemperature > chimpNormalTemparature + 0.1 -> foxiesHealthCheck.put("temperature", "high")
        else -> foxiesHealthCheck.put("temperature", "low")
    }

    foxiesHealthCheck.put("mood", "happy")
    println("Foxie has a ${foxiesHealthCheck["temperature"]} temperature; it is feeling ${foxiesHealthCheck["mood"]}.")

    responsibilitiesComplete += 1
    timeSpent += 1
    println("You've now completed  $responsibilitiesComplete / $responsibilitySize responsibilities.")

    // Wrapping Up

    // responsibilitiesComplete = 2
    // timeSpent = 5

    if (responsibilitiesComplete >= responsibilitySize) {
        if (timeSpent <= totalShiftTime) {
            println("\nCongratulations on a great job of completing the responsibilities on time!")
        } else {
            println("\nAll responsibilities were complete but with overtime.")
        }
    } else if (timeSpent > totalShiftTime) {
        println("\nAll of the responsibilities were not complete and took extra time.")
    } else {
        println("\nNot all responsibilities were complete.")
    }
}