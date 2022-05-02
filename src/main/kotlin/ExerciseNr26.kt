/*Given a string and integer shift implement a function which shifts each character
in that string by shift amount ( cesar cipher) eg. if shift is 1 then a becomes b, c becomes d, z became a etc.
Allowed input is a string containing only lowercase characters from the alphabet abcdefghijklmnopqrstuvwxyz.
Examples:
encodeCaesarCipher("abc", 1) // bcd

encodeCaesarCipher("abc", 3) // def

encodeCaesarCipher("xyz", 1) // yza
*/


fun main(){
    println(encodeCaesarCipher("asdf", 3))
}

fun encodeCaesarCipher(str: String, shift: Int): String {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"

    var encoded = ""

    str.forEach {
        val indexInAlphabet = alphabet.indexOf(it)
        val newIndex = (indexInAlphabet + shift) % alphabet.length
        encoded += alphabet[newIndex]
    }

    return encoded
}