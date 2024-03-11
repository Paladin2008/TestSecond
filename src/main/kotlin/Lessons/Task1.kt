package Lessons

//В мобильной игре есть разные существа. Напиши интерфейсы для летающих и плавающих существ.
//создай интерфейсы с методами передвижения для: карась, чайка, утка;
//создай для каждого существа классы, реализующие соответствующие интерфейсы;
//выведи сообщения в консоль, о том как они могут передвигаться.
fun main() {

    val carp = Carp()
    carp.startFinFlapping()

    val gull = Gull("Чайка речная")
    gull.startWingFlapping()
    gull.startMovingPaws()

    val duck = Duck("Утка озерная")
    duck.startWingFlapping()
    duck.startMovingPaws()
}

interface Flitter {

    fun startWingFlapping() {
        println("Начинает двигать крылом")
    }
}

interface Floating {

    fun startFinFlapping() {
        println("Начинает двигать плавником")
    }

    fun startMovingPaws() {
        println("Начинает двигать лапами")
    }
}

abstract class Birds(val name: String) : Flitter, Floating

class Carp() : Floating

class Gull(name: String) : Birds(name) {
    override fun startWingFlapping() {
        println("$name начинает двигать крылом для взлета")
    }

    override fun startMovingPaws() {
        println("$name начинает двигать лапами для плавания")
    }
}

class Duck(name: String) : Birds(name) {

    override fun startWingFlapping() {
        println("$name начинает двигать крылом для взлета")
    }

    override fun startMovingPaws() {
        println("$name начинает двигать лапами для плавания")
    }
}