/*
*Given positive integer n implement a function, which returns a factorial of that integer.
* Factorial (of positive integer) is a number that is created by multiplying all numbers from 1 to n
* eg. factorial of 3 (3!) is equal to 6 (3 * 2 * 1)
Examples:
factorial(1) // 1

factorial(2) // 2

factorial(3) // 6
*/

//fun main(){
//    println(factorial(2))
//}

fun factorial(n: Int): Int {
    var total = 1

    (1..n).forEach {
        total *= it
    }

    return total
}