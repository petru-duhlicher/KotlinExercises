

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

fun main(){
    println(decapitalizeConst("FOO_FOO"))
}

fun decapitalizeConst(str: String): String {
    val list = str.split("_").map { it.lowercase().uppercase() }
    return list.joinToString("").lowercase()
}