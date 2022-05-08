/*
Given a string, return true if the string is a palindrome or false if it is not.
 Palindromes are strings that form the same word if it is reversed.
 Include spaces and punctuation in determining if the string is a palindrome.
Examples:
palindrome("abba") // true

palindrome("0") // false
*/

//fun main(){
//    println(palindrome("abba"))
//}

fun palindrome(str: String): Boolean = str == str.reversed()
