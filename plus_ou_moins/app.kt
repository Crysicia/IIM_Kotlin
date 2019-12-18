fun main() {
    var target: Int = parsePassword()
    var game: Game = Game(target)
    game.run()
}