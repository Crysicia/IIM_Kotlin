class Game(val target: Int) {
    var tries: Int = 0
    var guess: Int = 0

    private fun thermometer(delta: Int): String {
        return when(delta) {
            1 -> "on fire"
            in 2..10 -> "very warm"
            in 11..25 -> "warm"
            in 26..50 -> "slightly warm"
            in 51..75 -> "cold"
            in 76..100 -> "very cold"
            else -> "freezing"
        }
    }

    private fun compare(guess: Int, target: Int): Boolean {
        var temperature: String = thermometer(Math.abs(target - guess))

        return if (guess > target) {
            println("Less ! You are $temperature")
            false
        } else if (guess < target) {
            println("More ! You are $temperature")
            false
        } else {
            println("You found it! Congratulations !")
            true
        }
    }

    private fun makeAGuess(): Any {
        print("Make a guess (Press q to abort): ")
        var input: String = readLine()!!

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