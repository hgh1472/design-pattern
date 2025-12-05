package factorymethod.abstract_factory.after

class WhitePartsProFactory: ShipPartsFactory {
    override fun createAnchor(): Anchor = WhiteAnchorPro()

    override fun createWheel(): Wheel = WhiteWheelPro()
}
