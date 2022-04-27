/*
Given two ranges, implement a function that checks if range1 contains range2.
	Examples:
	containsRange(5..7, 5..7) // true

containsRange(1..12, 5..7) // true

containsRange(5..8, 5..9) // false

*/
fun main(args: Array<String>){
    println( containsRange(5..7,5..7) )

}
fun containsRange(range1: IntRange, range2: IntRange) =
    range2.first >= range1.first && range2.last <= range1.last

