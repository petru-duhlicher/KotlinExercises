/*
Given a list of strings and a string return index of the value in the list or -1 if the value was not found.
Don't use any Kotlin build-in methods that are directly returning index of element like
 indexOf / lastIndexOf / indexOfFirst / indexOfLast, etc.
	Examples:
	getIndex(listOf("A", "B", "C"), "A") // 0

getIndex(listOf("A", "B", "C"), "B") // 1

getIndex(listOf("A", "B", "C"), "D") // -1

* */
//fun main(args: Array<String>){
//    println(getIndex(listOf("A", "B", "C"), "C"))
//}
fun getIndex(list: List<String>, string: String): Int {

    for (index in list.indices)
        if (list[index] == string)
            return index

    return -1 // does not belong to list
}