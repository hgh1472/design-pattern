package flyweight.after

fun main() {
    val fontFactory = FontFactory()
    val c1 = Character('h', "white", fontFactory.getFont("nanum:12"))
    val c2 = Character('e', "white", fontFactory.getFont("nanum:12"))
    val c3 = Character('l', "white", fontFactory.getFont("nanum:12"))
}
