package lesson14

class Freight1(
    name: String = "Грузовой",
    capacityPassengers: Int = 30,
    maxSpeed: Int = 60,
    capacityLifting: Int = 40,
) : Liner1(name, capacityPassengers, maxSpeed, capacityLifting) {

    override fun embarkation() {
        println("Способ погрузки: Активирует погрузочный кран")
    }
}