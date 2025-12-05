package factorymethod.abstract_factory.before

import factorymethod.abstract_factory.after.ShipPartsFactory
import factorymethod.after.DefaultShipFactory
import factorymethod.after.Ship
import factorymethod.after.WhiteShip

// Client
class WhiteshipFactory(
    private val shipPartsFactory: ShipPartsFactory,
): DefaultShipFactory() {

    override fun createShip(): Ship {
        val ship = WhiteShip()
        ship.anchor = shipPartsFactory.createAnchor()
        ship.wheel = shipPartsFactory.createWheel()
        return ship
    }
}
