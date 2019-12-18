import java.io.Console

fun readPassword(): CharArray = System.console().readPassword()

fun parsePassword(): Int {
    print("Enter a number to guess : ")
    var input: String = String(readPassword())
    return if (input.toIntOrNull() == null) {
        println("Please enter an integer")
        parsePassword()
    } else {
        input.toInt()
    }
}