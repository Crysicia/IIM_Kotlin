val selectableAnimals = mapOf<String, Animal>("chat" to Chat(), "chien" to Chien(), "perroquet" to Perroquet())

fun select(): Animal {
    val animals = selectableAnimals.keys
    print("Select an animal between the followings : $animals\n> ")

    val input = readLine()!!.toLowerCase()

    return if (animals.contains(input)) {
        selectableAnimals[input]!!
    } else {
        println("Sorry I don't know this kind of animal")
        select()
    }
}

fun main(): Unit {
    val animalerie = Animalerie()
    animalerie.add(select())
    animalerie.add(select())
    animalerie.add(select())
    animalerie.affiche()
}