package Lessons

//На сайте музыкального магазина есть товары двух категорий: инструменты и комплектующие к ним. Все
//товары имеют название и количество единиц на складе.
//Для инструментов есть возможность поиска соответствующих комплектующих.
//Опиши классы для категорий товаров. Имитируй процесс поиска
//текстовым сообщением «Выполняется поиск». Для выноса логики поиска используй интерфейс.
fun main() {

    val instruments1 = Instruments("пианино", 3)
    val instruments2 = Instruments("скрипка", 7)

    val components1 = Components("клавиши", 10)
    val components2 = Components("струны", 20)

    instruments1.searchComponents(components1)
}

interface Search {

    fun searchComponents(componentsName: Components)
}

class Components(val name: String, val amount: Int)

class Instruments(val name: String, val amount: Int) : Search {
    override fun searchComponents(componentsName: Components) {
        println("Выполняется поиск $name")
    }
}


