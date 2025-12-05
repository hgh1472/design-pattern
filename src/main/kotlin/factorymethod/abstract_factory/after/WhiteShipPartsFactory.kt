package factorymethod.abstract_factory.after

import factorymethod.abstract_factory.before.WhiteAnchor
import factorymethod.abstract_factory.before.WhiteWheel

class WhiteShipPartsFactory: ShipPartsFactory {
    override fun createAnchor(): Anchor {
        return WhiteAnchor()
    }

    override fun createWheel(): Wheel {
        return WhiteWheel()
    }
}
