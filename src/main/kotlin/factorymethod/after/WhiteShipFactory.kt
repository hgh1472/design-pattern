package factorymethod.after

object WhiteShipFactory : DefaultShipFactory() {
    override fun createShip(): Ship = WhiteShip()
}
