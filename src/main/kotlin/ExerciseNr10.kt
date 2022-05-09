/*Given a sorted list of integers implement a function which counts the unique values.
Examples:
countUniqueValues([]) // 0

countUniqueValues([1, 1, 6]) // 2

countUniqueValues([-2, -1, -1, 0, 1]) // 4
*/

fun main(){

   println(countUniqueValues(listOf(-2, -1, -1, 0, 1)))
}

//fun countUniqueValues(list: List<Int>): Int = list.distinct().size

fun countUniqueValues(values: List<Int>): Int {
   val list: MutableList<Int> = arrayListOf()
   for (element in values) {
      if (!list.contains(element)){
         list.add(element)
      }
   }
   return list.size
}