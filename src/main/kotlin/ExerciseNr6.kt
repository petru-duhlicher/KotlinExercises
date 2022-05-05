/*Given positive integer n, implement a function that returns a list containing all steps from n to 0.
	Examples:
	countDown(1) // [1, 0]

countDown(4) // [4, 3, 2, 1, 0]
*/

fun main(args: Array<String>){
    println(countDown(4))
}

fun countDown(n: Int): List<Int> = (n downTo 0).toList()
