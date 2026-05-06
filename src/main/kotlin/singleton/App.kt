package singleton

fun main() {
    val settings1 = Settings.getInstance()
    val settings2 = Settings.getInstance()
    println(settings1 === settings2)

    val constructor = Settings::class.java.getDeclaredConstructor()
    constructor.isAccessible = true
    val settings3 = constructor.newInstance()
    println(settings1 === settings3)
}
