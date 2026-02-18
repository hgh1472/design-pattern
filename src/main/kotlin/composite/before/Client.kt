package composite.before

class Client {
    fun printPrice(item: Item) {
        println("${item.name}의 가격은 ${item.price}원 입니다.")
    }

    fun printPrice(bag: Bag) {
        val sum = bag.items.sumOf { it.price }
        println("가방 안의 아이템들의 총 가격은 ${sum}원 입니다.")
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
