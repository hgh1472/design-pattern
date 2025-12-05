package factorymethod.after

import factorymethod.abstract_factory.after.Anchor
import factorymethod.abstract_factory.after.Wheel

open class Ship(
    var name: String? = null,
    var color: String? = null,
    var logo: String? = null,
    var anchor: Anchor? = null,
    var wheel: Wheel? = null,
) {
    override fun toString(): String {
        return "Ship(name=$name, color=$color, logo=$logo)"
    }
}
