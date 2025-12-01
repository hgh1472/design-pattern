package factorymethod.after

object BlackshipFactory: DefaultShipFactory() {
    override fun createShip(): Ship = BlackShip()
}
