package proxy.after

class GameServiceProxy(
    val gameService: GameService,
) : GameService {
    override fun startGame() {
        val before = System.currentTimeMillis()
        gameService.startGame()
        println(System.currentTimeMillis() - before)
    }
}
