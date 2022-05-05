/*Given a list of integers implement a function that returns the product of all numbers in the list.
Examples:
product(listOf(1, 2)) // 2

product(listOf(1, 2, 4)) // 8

product(listOf(2, 4, 10)) // 80
*/

//fun main(){
//    println(product(listOf(1,2)))
//}


fun product(list: List<Int>): Int {
    if (list.size == 1) {
        return list.first()
    }

    return list.first() * product(list.drop(1))
}