package factorymethod.before

class Client {
}

fun main(args: Array<String>) {
    val whiteShip = ShipFactory.orderShip("Whiteship", "test@gmail.com")
    println(whiteShip)

    val blackShip = ShipFactory.orderShip("Blackship", "test@gmail.com")
    println(blackShip)
}
