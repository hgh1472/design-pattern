package bridge.before

class PoolPartyAiri : Champion {
    override fun move() {
        println("풀파티 아리가 이동합니다.")
    }

    override fun skillQ() {
        println("풀파티 아리가 Q 스킬을 사용합니다.")
    }

    override fun skillW() {
        println("풀파티 아리가 W 스킬을 사용합니다.")
    }

    override fun skillE() {
        println("풀파티 아리가 E 스킬을 사용합니다.")
    }

    override fun skillR() {
        println("풀파티 아리가 R 스킬을 사용합니다.")
    }
}
