package factorymethod.abstract_factory.after

import factorymethod.abstract_factory.before.WhiteshipFactory


class ShipInventory {
}

fun main() {
    val shipFactory = WhiteshipFactory(WhiteShipPartsFactory())
    val ship = shipFactory.createShip()
    println(ship.anchor!!::class.java)
    println(ship.wheel!!::class.java)
}
