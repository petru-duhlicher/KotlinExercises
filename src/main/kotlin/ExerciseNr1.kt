//Let the fun begin!!!

// Exercise Nr.1
/*Given a string, implement a function that capitalizes the first letter of every word in that string.ad
Examples:
capitalizeSentence("flower") // Flower

capitalizeSentence("this is a house") // This Is A House
*/


 //uncomment following code for a simple run of the function
//fun main(args: Array<String>){
//
//    println(capitalizeSentence("this is a house"))
//}
// run this
//fun String.capitalizeWords(): String = split(" ").map { it.capitalize() }.joinToString(" ")
//var s: String = "this is a house"


fun capitalizeSentence(str: String?): String? {
     return if (str == null || str.isEmpty()) {
        str
    } else  return str.substring(0, 1).uppercase() + str.substring(1)
}
