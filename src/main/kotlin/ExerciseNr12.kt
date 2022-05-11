/*Given a positive integer base and a positive integer exponent implement a
 function that calculates the power of base of exponent. This function should mimic the functionality of Math.pow.
Examples:
power(2, 1) // 2

power(2, 2) // 4

power(3, 3) // 27
*/

//fun main(){
//    println(power(3,3))
//}
fun power(base: Int, exponent: Int): Int {
    if (exponent == 1) {
        return base
    }

    return base * power(base, exponent - 1)
}