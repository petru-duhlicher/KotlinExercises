/*Given positive integer n, implement a function that returns a list containing all steps up from 0 to n and down to 0.
Examples:
countUpAndDown(1) // [0, 1, 0]

countUpAndDown(2) // [0, 1, 2, 1, 0]
*/

fun main(args: Array<String>){
    println(countUpAndDown(2))
}
fun countUpAndDown(n: Int): List<Int> {
    return (0 until n) + (n downTo 0)
}