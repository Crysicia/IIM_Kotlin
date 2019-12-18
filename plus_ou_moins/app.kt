fun main() {
    var target = parsePassword()
    var game = Game(target)
    game.run()
}