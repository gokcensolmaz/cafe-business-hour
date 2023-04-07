import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    print("Enter the weekday: ")
    val weekday: String = input.nextLine()
    print("Enter the hour: ")
    val hour: Int = input.nextInt()

    val businessHour : ClosedRange<Int> = when (weekday.lowercase()) {
        "monday" -> 8..12
        "tuesday" -> 8..18
        "wednesday" -> 8..18
        "thursday" -> 8..18
        "friday" -> 8..21
        "saturday" -> 9..16
        "sunday" -> 8..16
        else -> -1..0
    }
    println("On $weekday, the opening hours are: $businessHour")
    if (hour in businessHour) {
        println("Little Lemon is open now")
    } else {
        println("Little Lemon is closed now")
    }
}


