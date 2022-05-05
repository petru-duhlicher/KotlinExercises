/*
* Given a string, implement a function that returns the character that is most commonly used in that string.
Examples:
maxChar("abcccccccd") // "c"

maxChar("apple 1231111") // "1"
*/

//fun main(){
//
//    println(stringChar("abcccccccccd"))
//}


fun stringChar(str: String) {
    var c = str.toCharArray()
    var common = false
    for (i in str.indices) {
        for (j in i + 1 until str.length) {
            if (c[i] == c[j]) {
                println(c[j])
                common = true
                break
            }
        }
        if (common) {
            break
        }
    }
}
