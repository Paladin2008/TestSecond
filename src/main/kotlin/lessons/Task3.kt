package lessons

//Создай класс, описывающий пользователя, который хранит поля логин и пароль.
//Пароль не должен быть виден в теле главной функции, но
//должен быть способ проверить, что пароль введен верно. Функция валидации должна
//принимать строку и возвращать результат проверки (и только его – без распечатки или генерации других строк).
//Выведи информацию о релевантности пароля в консоль.
fun main() {

    val user = User()
    val inputPass = readln()

    println(user.validation(inputPass))
}

class User(val login: String = "login", private val password: String = "пароль") {

    fun validation(enteredPass: String): Boolean {
        return enteredPass == password
    }
}