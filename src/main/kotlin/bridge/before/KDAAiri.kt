package bridge.before

class KDAAiri : Champion {
    override fun move() {
        println("KDA 아리가 이동합니다.")
    }

    override fun skillQ() {
        println("KDA 아리가 Q 스킬을 사용합니다.")
    }

    override fun skillW() {
        println("KDA 아리가 W 스킬을 사용합니다.")
    }

    override fun skillE() {
        println("KDA 아리가 E 스킬을 사용합니다.")
    }

    override fun skillR() {
        println("KDA 아리가 R 스킬을 사용합니다.")
    }
}
