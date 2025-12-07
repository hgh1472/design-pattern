package builder.after

import java.time.LocalDate

class App {
}

fun main() {
    val director = TourDirector(DefaultTourBuilder())
    val plan = director.cancunTrip()

    val longBeachTrip = director.longBeachTrip()
}
