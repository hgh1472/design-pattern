package factorymethod.after

abstract class DefaultShipFactory: ShipFactory {

    override fun sendMailTo(email: String, ship: Ship) {
        println("${email}로 ${ship.name} 준비완료 메일 발송")
    }
}
