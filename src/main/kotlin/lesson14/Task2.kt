package lesson14

//Скопируй классы из предыдущей задачи и измени их названия для избегания конфликтов.
//Каждый тип корабля обладает уникальным способом погрузки:
//- лайнер выдвигает горизонтальный трап со шкафута;
//- грузовой корабль активирует погрузочный кран;
//- ледокол открывает ворота со стороны кормы.
//Реализуй методы погрузки, специфичные для каждого вида корабля.
//Добавь метод вывода информации о свойствах корабля и выведи информацию в консоль.
fun main() {

    val ship1 = Liner1()
    println("Тип корабля: ${ship1.name}")
    println("Максимальное количество пассажиров: ${ship1.capacityPassengers}")
    println("Максимальная скорость: ${ship1.maxSpeed}")
    println("Грузоподъемность: ${ship1.capacityLifting}")
    if (ship1.abilityCrushIce == false) {
        println("Не может пробивать лед")
    } else {
        println("Может пробивать лед")
    }
    ship1.embarkation()
    println(" ")

    val ship2 = Freight1()
    println("Тип корабля: ${ship2.name}")
    println("Максимальное количество пассажиров: ${ship2.capacityPassengers}")
    println("Максимальная скорость: ${ship2.maxSpeed}")
    println("Грузоподъемность: ${ship2.capacityLifting}")
    if (ship2.abilityCrushIce == false) {
        println("Не может пробивать лед")
    } else {
        println("Может пробивать лед")
    }
    ship2.embarkation()
    println(" ")

    val ship3 = Icebreaker1()
    println("Тип корабля: ${ship3.name}")
    println("Максимальное количество пассажиров: ${ship3.capacityPassengers}")
    println("Максимальная скорость: ${ship3.maxSpeed}")
    println("Грузоподъемность: ${ship3.capacityLifting}")
    if (ship3.abilityCrushIce == false) {
        println("Не может пробивать лед")
    } else {
        println("Может пробивать лед")
    }
    ship3.embarkation()
}