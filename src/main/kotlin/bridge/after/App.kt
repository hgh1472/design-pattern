package bridge.after

fun main() {
    val kda = Airi(KDA())
    kda.skillQ()
    kda.skillW()

    val poolParty = Airi(PoolParty())
    poolParty.skillR()
    poolParty.skillW()
}
