package proxy.before

open class GameService {
    open fun startGame() {
        println("환엽합니다.")
        Thread.sleep(1000)
    }
}
