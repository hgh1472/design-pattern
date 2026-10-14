package proxy.after

fun main() {
    val gameService = GameServiceProxy(DefaultGameService())

    gameService.startGame()
}
