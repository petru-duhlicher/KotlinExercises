/*Given positive integer n implement a function that returns a list representing all numbers from n to 1. If n value is zero then an empty list should be returned.
Examples:
printNumber(0) // []

printNumber(2) // [2, 1]

printNumber(5) // [5, 4, 3, 2, 1]
*/

fun main(){
    println(printNumber(0))
}

fun printNumber(n: Int): List<Int> =
when (n) {
    0 -> emptyList()
    else -> listOf(n) + printNumber(n - 1)
}