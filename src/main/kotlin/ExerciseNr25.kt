/*Given a string implement a function that returns true if the string contains at least one repeated character,
 otherwise, it returns false.
Examples:
hasRepeatedCharacter("abc") // false"

hasRepeatedCharacter("aabc") // true

hasRepeatedCharacter("aabcc") // true

*/
fun main(){
    println(hasRepeatedCharacter("aadddss"))
}

fun hasRepeatedCharacter(str: String): Boolean {
    val frequency = str.groupingBy { it }.eachCount()

    frequency.forEach {
        if (it.value > 1) {
            return true
        }
    }

    return false
}