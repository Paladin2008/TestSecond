package Lessons

//Задача 2 к Уроку 16
//Создай класс, описывающий круг. У него должны быть методы, вычисляющие
//длину окружности и площадь круга, используя радиус.
//Число Pi должно быть равным 3.14, быть недоступным в других файлах и защищенным от изменений извне. Радиус
//передается через конструктор и не виден из внешнего по отношению к классу кода.
//Создай объект, вызови у него методы для расчета окружности и площади и выведи данные в консоль.
fun main() {

    val circle = Circle(3)
    circle.circumference()
    circle.area()

//    circle.pi
//    circle.radius
}

private const val pi = 3.14

class Circle(private val radius: Int) {

    fun circumference() {
        println("Длина ${2 * pi * radius}")
    }

    fun area() {
        println("Площадь ${radius * radius * pi}")
    }
}