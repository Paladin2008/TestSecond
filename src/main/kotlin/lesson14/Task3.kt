package lesson14

//Напиши программу для работы с геометрическими фигурами: кругом и прямоугольником.
//Каждая фигура имеет свой цвет и уникальные параметры:
//- для круга — радиус;
//- для прямоугольника — ширину и высоту.
//Создай абстрактный класс Figure с полем color. Внутри определи два абстрактных метода:
//- для вычисления площади;
//- для вычисления периметра.
//Добавь классы-наследники для вышеупомянутых типов фигур.
//Реализуй методы для вычисления площади и периметра
//в каждом из классов-наследников (формулы можно найти в интернете).
//Создай несколько объектов разных цветов (черные и белые) и сохрани в единый список. Выведи в консоль:
//- сумму периметров всех черных фигур;
//- сумму площадей всех белых фигур.
fun main() {

    val rectangle1 = Rectangle(4, 8, "white")
    rectangle1.square()
    rectangle1.perimeter()

    val rectangle2 = Rectangle(6, 9, "black")
    rectangle2.square()
    rectangle2.perimeter()

    val circle1 = Circle(8, "white")
    circle1.square()
    circle1.perimeter()

    val circle2 = Circle(12, "black")
    circle2.square()
    circle2.perimeter()

    val list = mutableListOf(rectangle1, rectangle2, circle1, circle2)

    val sumSquare = list.filter { it.color == "white" }.sumOf { it.square() }
    val sunPerimeter = list.filter { it.color == "black" }.sumOf { it.perimeter() }

    println(sumSquare)
    println(sunPerimeter)
}

abstract class Figure(
    val color: String
) {
    abstract fun square(): Int

    abstract fun perimeter(): Int
}

class Circle(
    val radius: Int,
    color: String,
) : Figure(color) {
    override fun square(): Int {
        val computeSquare = (radius * radius * 3.14).toInt()
        return computeSquare
    }

    override fun perimeter(): Int {
        val computePerimeter = (2 * 3.14 * radius).toInt()
        return computePerimeter
    }
}

class Rectangle(
    val width: Int,
    val height: Int,
    color: String,
) : Figure(color) {

    override fun square(): Int {
        val computeSquare = width * height
        return computeSquare
    }

    override fun perimeter(): Int {
        val computePerimeter = (width + height) * 2
        return computePerimeter
    }
}