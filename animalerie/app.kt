val selectableAnimals = mapOf<String, Animal>("chat" to Chat(), "chien" to Chien(), "perroquet" to Perroquet())
val animalerie = Animalerie()

fun menu(): Unit {
    print("[A]dd an animal, [S]how the animals in the shelter, [Q]uit : ")
    val input = readLine()!!.toLowerCase()

    when(input) {
        "a" -> animalerie.add(select())
        "s" -> animalerie.affiche()
        "q" -> System.exit(0)
        else -> println("Sorry, I don't recognize this command, please try again.")
    }
    menu()
}

fun select(): Animal {
    val animals = selectableAnimals.keys
    print("Select an animal between the followings : $animals\n> ")
    val input = readLine()!!.toLowerCase()

    return if (animals.contains(input)) {
        selectableAnimals[input]!!
    } else {
        println("Sorry I don't know this kind of animal.")
        select()
    }
}

fun main(): Unit {
    println("Welcome to the shelter, what do you want to do ?")
    menu()
}