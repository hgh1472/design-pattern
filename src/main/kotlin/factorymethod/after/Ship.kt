package factorymethod.after

open class Ship(
    var name: String? = null,
    var color: String? = null,
    var logo: String? = null,
) {
    override fun toString(): String {
        return "Ship(name=$name, color=$color, logo=$logo)"
    }
}
