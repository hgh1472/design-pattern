package composite.after

class Bag : Component {
    val items: MutableList<Component> = mutableListOf()

    override var price: Int = items.sumOf { it.price }

    fun add(item: Component) {
        items.add(item)
    }
}
