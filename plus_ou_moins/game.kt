import java.io.Console

class Game(val target: Int) {
    val console: Console? = System.console()
    var tries: Int = 0
    var guess: Int = 0

    private fun compare(guess: Int, target: Int): Boolean {
        return if (guess > target) {
            println("Less !")
            false
        } else if (guess < target) {
            println("More !")
            false
        } else {
            println("You found it! Congratulations !")
            true
        }
    }

    private fun makeAGuess(): String {
        print("Make a guess (Press q to abort): ")
        return readLine()!!
    }

    fun run(): Unit {
        do {
            guess = makeAGuess().toInt()
        } while (!compare(guess, target))
    }
}