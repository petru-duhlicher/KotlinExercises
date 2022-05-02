/*Given a string, implement a function that returns the longest word in that string.
If there are two or more words that have the same length, return the first longest word from the string.
Ignore punctuation. Input string can't be empty or blank string.
Examples:
longestWord("big flower") // flower

longestWord("this is a house") // house
*/

//fun main(){
//    println(longestWord("big flower housesss"))
//}
//
//fun longestWord(a: String): String? {
//    val parts = a.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
//    var longest: String? = null
//    for (part in parts) {
//        if (longest == null || longest.length < part.length) {
//            longest = part
//        }
//    }
//    return longest
//}