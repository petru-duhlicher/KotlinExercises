/*
* Given a string, implement a function that returns a reversed copy of that string. Don't use Kotlin String.reverse function
Examples:
reverse('apple') == 'elppa'

reverse('hello') == 'olleh'

reverse('Greetings!') == '!sgniteerG'
*/

fun main(){
    println(reverse("apple"))
}

fun reverse(str: String): String {
    var reversed = ""
    str.forEach {
        reversed = it + reversed
    }
    return reversed
}