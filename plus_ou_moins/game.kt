class Game(val target: Int) {
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

    private fun makeAGuess(): Any {
        print("Make a guess (Press q to abort): ")
        var input = readLine()!!

        return if (input.toLowerCase() == "q") {
            System.exit(0)
        } else if (input.toIntOrNull() == null) {
            println("Please enter an integer")
            makeAGuess()
        } else {
            input.toInt()
        }
    }

    fun run(): Unit {
        do {
            guess = makeAGuess() as Int
        } while (!compare(guess, target))
    }
}