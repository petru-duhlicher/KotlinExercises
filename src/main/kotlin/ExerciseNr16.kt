/*Given a string representing a constant name (eg. FOO_BAR) implement a function
that converts it into a variable name (eg. fooBar):
convert the first word to lowercase
convert next words to lowercase, but the first character is still uppercase
remove all underscore characters
Examples:
decapitalizeConst("FOO") // foo

decapitalizeConst("FOO_BAR") // fooBar

decapitalizeConst("__FOO_BAR_BAZ") // fooBarBaz
*/

//fun main(){
//
//    println(decapitalizeConst("__FOO_BAR_BAZ"))
//}
//


//fun decapitalizeConst(str: String): String? {
//    val words = str.split("_").filter { it.isNotEmpty() }
//
//    if (words.size <= 1) return null
//
//    return words.mapIndexed { index, word ->
//        if (index == 0) {
//            word.lowercase()
//        } else {
//            word.first().uppercase() + word.drop(1).lowercase()
//        }
//    }.joinToString("")
//}