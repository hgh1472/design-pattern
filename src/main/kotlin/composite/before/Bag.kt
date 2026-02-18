package composite.before

class Bag {
    val items: MutableList<Item> = mutableListOf()

    fun add(item: Item) {
        items.add(item)
    }
}
