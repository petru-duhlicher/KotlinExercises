/*Given two strings, implement a function to determine if the second string is an anagram of the first.
An anagram is a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.
Only consider characters, not spaces or punctuation. Consider capital letters to be the same as lower case.
Examples:
anagrams("rail safety", "fairy tales") --> True

anagrams("RAIL! SAFETY!", "fairy tales") --> True

anagrams("Hi there", "Bye there") --> False
*/

//fun main(){
//    println(anagrams("RAIL! SAFETY!", "fairy tales"))
//
//}

fun anagrams(str1: String, str2: String): Boolean {
    val first = str1.uppercase().filter { it.isLetter() }.groupBy { it }
    val second = str2.uppercase().filter { it.isLetter() }.groupBy { it }
    return first == second
}


