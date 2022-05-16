/*Given a positive integer n implement a function that returns a list representing the generatePyramid shape with n levels.
The function should console log a generatePyramid shape with N levels using the # character.
Make sure the generatePyramid has spaces on both the left and right-hand sides.
Examples:
pyramid(1)
    '#'

pyramid(2)
    ' # '
    '###'

pyramid(3)
    '  #  '
    ' ### '
    '#####'
*/


//fun main(args: Array<String>) {
//    println(pyramid(4))
//}

fun pyramid(rows: Int) {

    var k = 0

    for (i in 1..rows) {

        for (space in 0..rows - i) {
            print("  ")

        }

        while (k != 2 * i - 1) {

            print("#")

            k++
        }

        k = 0
        println()

    }
}
