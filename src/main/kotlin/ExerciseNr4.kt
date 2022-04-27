/*Given positive integer n, implement a function that calculates the sum of all numbers from 1 up to (and including) number n.
Examples:
addUpTo(1) // 1

addUpTo(2) // 3

addUpTo(3) // 6
*/

fun main(args: Array<String>){
    println(addUpTo(9))
}
fun addUpTo(n: Int): Int {
    if (n == 1) {
        return 1
    }

    return n + addUpTo(n - 1)
}