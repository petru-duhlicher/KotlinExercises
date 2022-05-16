/*Given a list of integers implement a function that returns the product of all numbers in the list.
Examples:
product(listOf(1, 2)) // 2

product(listOf(1, 2, 4)) // 8

product(listOf(2, 4, 10)) // 80
*/

fun main(){
    println(product(listOf(2, 4, 10)))
}


fun product(list: List<Int>): Int {

    return list.reduce { acc, i -> acc * i }

}
