class Animalerie {
    var list = mutableListOf<Animal>()

    fun add(input: Animal): Unit {
        list.add(input)
    }

    fun affiche(): Unit {
        for (animal in list) {
            animal.quiSuisJe()
        }
    }
}