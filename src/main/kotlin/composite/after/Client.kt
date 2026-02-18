package composite.after

class Client {
    fun printPrice(component: Component) {
        println(component.price)
    }
}

fun main() {
    val doranBlade = Item("도란검", 450)
    val healPotion = Item("체력 물약", 50)

    val bag = Bag()
    bag.add(doranBlade)
    bag.add(healPotion)

    val client = Client()
    client.printPrice(doranBlade)
    client.printPrice(bag)
}
