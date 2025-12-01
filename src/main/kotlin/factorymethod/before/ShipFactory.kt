package factorymethod.before

object ShipFactory {
    fun orderShip(name: String, email: String): Ship {
        // validation
        require(name.isNotBlank()) {
            throw IllegalArgumentException("배 이름은 필수입니다.")
        }
        require(email.isNotBlank()) {
            throw IllegalArgumentException("연락처는 필수입니다.")
        }

        prepareFor(name)

        val ship = Ship()
        ship.name = name

        // customizing
        if (name.equals("whiteship", true)) {
            ship.logo = "⚓"
        } else if (name.equals("blackship", true)) {
            ship.logo = "🏴‍☠️"
        }

        // coloring
        if (name.equals("whiteship", true)) {
            ship.color = "white"
        } else if (name.equals("blackship", true)) {
            ship.color = "black"
        }

        // notify
        sendMailTo(email, ship)

        return ship
    }

    private fun prepareFor(name: String) {
        println(name + "만들 준비 중")
    }

    private fun sendMailTo(email: String, ship: Ship) {
        println("${email}로 ${ship.name} 준비완료 메일 발송")
    }
}
