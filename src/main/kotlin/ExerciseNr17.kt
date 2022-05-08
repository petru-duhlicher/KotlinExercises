/*Given a string, implement a function that returns the longest word in that string.
If there are two or more words that have the same length, return the first longest word from the string.
Ignore punctuation. Input string can't be empty or blank string.
Examples:
longestWord("big flower") // flower

longestWord("this is a house") // house
*/

//fun main(){
//    println(longestWord("big floweras housesss"))
//
//}

fun longestWord(a: String): String? {
    val str = a.split(" ")
    var longest: String? = null
    for (word in str) {
        if ((longest == null) || (longest.length < word.length)) {
            longest = word
        }
    }
    return longest
}

