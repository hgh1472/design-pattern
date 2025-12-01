package factorymethod.after

interface ShipFactory {
    fun orderShip(name: String, email: String): Ship {
        validate(name, email)
        prepareFor(name)
        val ship = createShip()
        sendMailTo(email, ship)
        return ship
    }

    fun createShip(): Ship

    fun sendMailTo(email: String, ship: Ship)

    private fun validate(name: String, email: String) {
        require(name.isNotBlank()) {
            throw IllegalArgumentException("배 이름은 필수입니다.")
        }
        require(email.isNotBlank()) {
            throw IllegalArgumentException("연락처는 필수입니다.")
        }
    }

    private fun prepareFor(name: String) {
        println(name + " 만들 준비 중")
    }
}
