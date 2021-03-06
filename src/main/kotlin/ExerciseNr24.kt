/*Given positive integer n implement a function that returns a list numbers from 1 to 100. However,
for multiples of three list should contain the word Fizz instead of the number and for the multiples of five list should contain the word Buzz.
 For numbers that are multiples of both three and five list should contain FizzBuzz word.
Examples:
fizzBuzz(5) // [1, 2, "Fizz", 4, "Buzz"]

fizzBuzz(16) // [1, 2, "Fizz", 4, "Buzz", 5, "Fizz", 7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz", 16]
*/
//
//fun main(){
//    println(fizzBuzz(16))
//}

fun fizzBuzz(n: Int): List<String> {
    val list = mutableListOf<String>()

    for (i in 1..n) {
        val listItem = when {
            i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            else -> i.toString()
        }

        list.add(listItem)
    }

    return list
}
