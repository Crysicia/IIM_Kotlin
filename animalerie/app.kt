fun main(): Unit {
    val animalerie: Animalerie = Animalerie()
    animalerie.add(Chat())
    animalerie.add(Chien())
    animalerie.add(Perroquet())
    animalerie.affiche()
}