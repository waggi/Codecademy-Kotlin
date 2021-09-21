/*
DIY Functions
=============

Up until this point, whenever we have wanted to gather information about specific collections in our programs, we have relied on Kotlin standard library functions to give us the answers.

For example, we’ve used the sum() function to tell us the sum of the values in a list and the average() function to return the mean. We never had to fully understand how the program calculates this information; all we had to do was call a function on a collection and use whatever value the function returned.

In this project, we’re going to dive in and create five user-defined functions to collect and gather information about a list of numbers.
 */

//  Gathering a List of Values
fun getListOfNumbers(): List<Int> {
    val myList = mutableListOf<Int>()
    println("Please enter 7 numbers:")
    repeat(7) {
        myList.add(Integer.valueOf(readLine()))
    }
    return myList
}

// Finding the Maximum Value
fun findMax(list: List<Int>): Int {
    var largestNumber = list[0]
    list.forEach {
        if (it > largestNumber) {
            largestNumber = it
        }
    }
    return largestNumber
}

// Finding the Minimum Value
fun findMin(list: List<Int>): Int {
    var smallestNumber = list[0]
    list.forEach {
        if (it < smallestNumber) {
            smallestNumber = it
        }
    }
    return smallestNumber
}

// Finding the Difference Between the Largest and Smallest Values
fun findDiff(list: List<Int>): Int {
    return findMax(list) - findMin(list)
}

// Finding the Average
fun findAverage(list: List<Int>): Int {
    var sum = 0
    list.forEach {
        sum += it
    }
    return sum / list.size
}

// Finding if a List Contains a Value
fun checkIfListContains(list: List<Int>, value: Int): Boolean {
    list.forEach {
        if (it == value) return true
    }
    return false
}

fun main() {
    val values = getListOfNumbers()
    println(values)

    println("The largest number is ${findMax(values)}.")

    println("The smallest number is ${findMin(values)}.")

    println("The difference between the largest and smallest numbers is ${findDiff(values)}.")

    println("The average is ${findAverage(values)}.")

    println("Please enter a number:")
    val containsValue = checkIfListContains(values, Integer.valueOf(readLine()))
    if (containsValue) {
        println("Your number is in the list.")
    } else {
        println("There is no such number in the list.")
    }
}