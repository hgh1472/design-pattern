package factorymethod.after

class Client {
    fun print(shipFactory: ShipFactory, name: String, email: String) {
        println(shipFactory.orderShip(name, email))
    }
}

fun main(args: Array<String>) {
    val client = Client()
    client.print(WhiteShipFactory, "whiteship", "test@mail.com")
    client.print(BlackshipFactory, "blackship", "test@mail.com")
}
