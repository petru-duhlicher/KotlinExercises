/*Given a string implement a function that returns true if the string contains at least one repeated character,
 otherwise, it returns false.
Examples:
hasRepeatedCharacter("abc") // false"

hasRepeatedCharacter("aabc") // true

hasRepeatedCharacter("aabcc") // true

*/
//fun main(){
//    println(hasRepeatedCharacter("ac"))
//}


fun hasRepeatedCharacter(str: String): Boolean {
    var c = str.toCharArray()
    for (i in str.indices) {
        for (j in i + 1 until str.length) {
            if (c[i] == c[j]) {
                return true
                break

            }
        }

    }
    return false
}