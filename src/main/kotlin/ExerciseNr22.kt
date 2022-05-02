/*
* Given string implement a function, which returns the number of vowels used in a string.
*  Vowels are the characters a , e i, o, u and y.
Examples:
vowels('Hi There!') // 3

vowels('Why do you ask?') // 6

vowels('Why?') // 1
*/

fun main(){
    println(vowels(""))
}
fun vowels(str: String): Int {
    return Regex("[aeiouy]").findAll(str.lowercase()).count()
}