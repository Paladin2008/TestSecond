package lesson14

open class Liner1(
    val name: String = "Лайнер",
    val capacityPassengers: Int = 300,
    val maxSpeed: Int = 90,
    val capacityLifting: Int = 20,
    val abilityCrushIce: Boolean = false,
) {
    open fun embarkation() {
        println("Способ погрузки: Выдвигает горизонтальный трап со шкафута")
    }
}