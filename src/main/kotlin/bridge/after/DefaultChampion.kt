package bridge.after

open class DefaultChampion(
    val skin: Skin,
    val name: String,
) : Champion {
    override fun move() {
        println("${skin.name} $name move")
    }

    override fun skillQ() {
        println("${skin.name} $name Q")
    }

    override fun skillW() {
        println("${skin.name} $name W")
    }

    override fun skillE() {
        println("${skin.name} $name E")
    }

    override fun skillR() {
        println("${skin.name} $name R")
    }
}
