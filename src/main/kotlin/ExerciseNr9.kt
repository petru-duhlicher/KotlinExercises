/*Given positive Int n implement a function that returns a list of containing pairs with all combinations of numbers from 0 to n.
Examples:
getAllPairs(0) [Pair(0, 0)]
getAllPairs(1) [Pair(0, 0), Pair(0, 1), Pair(1, 0), Pair(1, 1)]
getAllPairs(2) [Pair(0, 0), Pair(0, 1), Pair(0, 2), Pair(1, 0), Pair(1, 1), Pair(1, 2), Pair(2, 0), Pair(2, 1), Pair(2, 2)]

*/
fun main(args: Array<String>){
    println(getAllPairs(1))
}
fun getAllPairs(n: Int): List<Pair<Int, Int>> {
    val result = mutableListOf<Pair<Int, Int>>()

    (0..n).forEach { i ->
        (0..n).forEach { j ->
            result.add(i to j)
        }
    }

    return result
}