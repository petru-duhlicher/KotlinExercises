/*
* Given a string, implement a function that returns the character that is most commonly used in that string.
Examples:
maxChar("abcccccccd") // "c"

maxChar("apple 1231111") // "1"
*/

fun main(){
    println(maxChar("abcccccccccd"))
}

fun maxChar(str: String): Char? {
    val set = mutableSetOf<Char>()

    str.forEach { char ->
        if (set.any { it == char }) {
            return char
        }

        set.add(char)
    }

    return null
}