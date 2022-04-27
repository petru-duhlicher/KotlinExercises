/*Given a list of strings representing train station names, implement a function that will return a passenger-friendly String:
The string always starts with Train is calling at
If the list contains a single train station name, then return Train is calling at stationName
If the list contains multiple train station names then return comma separated station names, but pre-last and last names are separated separated by and
	Examples:
formatTrainRoute(listOf("Luton")) // "Train is calling at Luton"
formatTrainRoute(listOf("Luton", "Harpenden")) // "Train is calling at Luton and Harpenden"
formatTrainRoute(listOf("Luton", "Harpenden", "London")) // "Train is calling at Luton, Harpenden and London"
*/

fun main(args: Array<String>){
    formatTrainRoute(listOf("Luton"))
}
fun formatTrainRoute(stations: List<String>): String {
    val str = "Train is calling at "

    if (stations.size == 1) {
        return str + stations[0]
    }

    val lastStation = stations.takeLast(1)
        .joinToString { it }

    val followingStations = stations.dropLast(1)
        .joinToString { it }

    return "$str$followingStations and $lastStation"
}