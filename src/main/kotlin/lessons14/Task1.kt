package lessons14

//В компьютерной игре есть три типа кораблей: лайнер,
//грузовой и ледокол. Все корабли построены на основе лайнера,
//но у каждого свой функционал и дополнительные свойства.
//У грузовых скорость меньше, а грузоподъемность больше.
//У ледоколов ниже и скорость, и вместительность,
//но они могут колоть лёд. Лайнер может вмещать наибольшее количество пассажиров.
//- спроектируй иерархию классов со значениями по умолчанию для каждого типа корабля;
//- создай по 1 экземпляру каждого типа корабля.
fun main() {

    val ship1 = Liner()
    println("Тип корабля: ${ship1.name}")
    println("Максимальное количество пассажиров: ${ship1.capacityPassengers}")
    println("Максимальная скорость: ${ship1.maxSpeed}")
    println("Грузоподъемность: ${ship1.capacityLifting}")
    if (ship1.abilityCrushIce == false) {
        println("Не может пробивать лед")
    } else {
        println("Может пробивать лед")
    }
    println(" ")

    val ship2 = Freight()
    println("Тип корабля: ${ship2.name}")
    println("Максимальное количество пассажиров: ${ship2.capacityPassengers}")
    println("Максимальная скорость: ${ship2.maxSpeed}")
    println("Грузоподъемность: ${ship2.capacityLifting}")
    if (ship2.abilityCrushIce == false) {
        println("Не может пробивать лед")
    } else {
        println("Может пробивать лед")
    }
    println(" ")

    val ship3 = Icebreaker()
    println("Тип корабля: ${ship3.name}")
    println("Максимальное количество пассажиров: ${ship3.capacityPassengers}")
    println("Максимальная скорость: ${ship3.maxSpeed}")
    println("Грузоподъемность: ${ship3.capacityLifting}")
    if (ship3.abilityCrushIce == false) {
        println("Не может пробивать лед")
    } else {
        println("Может пробивать лед")
    }
}