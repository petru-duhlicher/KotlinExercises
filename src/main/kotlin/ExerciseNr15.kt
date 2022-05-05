

/*Given a list of strings, implement a recursive function that will capitalize the first letter of each string in the list.
Examples:
capitalizeFirst(listOf("igor")) // listOf("Igor")

capitalizeFirst(listOf("igor", "wojda")) // listOf("Igor", "Wojda")

*/

//fun main(){
//    println(capitalizeFirst(listOf("igor")))
//}
//
//fun capitalizeFirst(list: List<String>): List<String> {
//    if (list.size == 1) {
//        return list.map { it.uppercase() }
//    }
//
//    return list.take(1).map { it.uppercase() } + capitalizeFirst(list.drop(1))
//}

