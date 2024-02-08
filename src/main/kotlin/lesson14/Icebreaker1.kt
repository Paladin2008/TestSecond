package lesson14

class Icebreaker1(
    name: String = "Ледокол",
    capacityPassengers: Int = 30,
    maxSpeed: Int = 40,
    capacityLifting: Int = 10,
) : Liner1(name, capacityPassengers, maxSpeed, capacityLifting, abilityCrushIce = true) {

    override fun embarkation() {
        println("Способ погрузки: Открывает ворота со стороны кормы")
    }
}