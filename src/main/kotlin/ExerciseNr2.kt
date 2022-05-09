/*
Given a list of integers, return a list that contains only odd integers (only integers that are not a multiple of 2).
	Examples:
	getOdd(listOf(1, 2, 3)) // 1, 3

getOdd(listOf(4, 6, 8, 7, 9)) // 7, 9
*/

// uncomment this for a simple run
//fun main(args: Array<String>) {
//
//    println(getOdd(listOf(4, 6, 8, 7, 9)))
//}



//fun getOdd(list: List<Int>): List<Int> {
//
//    if (list.isEmpty()) {
//        return list
//    }
//
//    return if (list.first() % 2 == 1) {
//        mutableListOf(list.first()) + getOdd(list.drop(1))
//    } else {
//        getOdd(list.drop(1))
//    }
//}
fun getOdd(list: List<Int>): List<Int> = list.filter { it % 2 == 1 }