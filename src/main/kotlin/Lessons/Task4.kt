package Lessons

//В компьютерной игре существуют планеты. У некоторых из них есть спутники.
//Планеты и спутники могут иметь атмосферу и могут быть пригодными для высадки.
//Создай родительский класс, описывающий небесные тела, и подклассы, описывающие планеты и спутники.
//планета должна хранить список спутников.
//Создай планету с двумя спутниками и выведи в консоль название планеты и названия всех ее спутников.

fun main() {

    val sputnik1 = Sputnik("Спутник1", false, false)
    val sputnik2 = Sputnik("Спутник2", false, true)
    val planet1 = Planet("Планета1", true, true, listOf(sputnik1, sputnik2))

    println("${planet1.name} ${sputnik1.name} ${sputnik2.name}")
}

open class SkyBody(
    val name: String,
    val atmos: Boolean,
    val landingPossible: Boolean,
)

class Sputnik(
    name: String,
    atmos: Boolean,
    landingPossible: Boolean,
) : SkyBody(name, atmos, landingPossible)

class Planet(
    name: String,
    atmos: Boolean,
    landingPossible: Boolean,
    val sputnik: List<Sputnik>
) : SkyBody(name, atmos, landingPossible)