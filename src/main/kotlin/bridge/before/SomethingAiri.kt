package bridge.before

class SomethingAiri : Champion {
    override fun move() {
        println("어떤 아리가 이동합니다.")
    }

    override fun skillQ() {
        println("어떤 아리가 Q 스킬을 사용합니다.")
    }

    override fun skillW() {
        println("어떤 아리가 W 스킬을 사용합니다.")
    }

    override fun skillE() {
        println("어떤 아리가 E 스킬을 사용합니다.")
    }

    override fun skillR() {
        println("어떤 아리가 R 스킬을 사용합니다.")
    }
}
