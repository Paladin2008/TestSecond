package Lessons


//На форуме есть два типа пользователей – обычные пользователи и администраторы.
//Пользователи могут читать форум и писать сообщения. Администраторы
//дополнительно могут удалять сообщения и пользователей.
//Опиши классы для сущностей пользователей и администраторов, используя абстрактный класс. У абстрактного класса
//должны быть соответствующие общие поля и методы. Действия на форуме отобрази сообщениями в консоль.
fun main() {

    val regularUsers = RegularUsers("Владимир")
    val admin = Admin("Админ")

    regularUsers.write()
    admin.read()
    admin.write()
}

abstract class Users() {

    abstract val access: String

    abstract fun read()

    abstract fun write()
}

interface Deletion {

    fun deleteUsers()
    fun deleteMessage()
}


class RegularUsers(override val access: String) : Users() {
    override fun read() {
        println("Пользователь $access читает")
    }

    override fun write() {
        println("Пользователь $access пишет")
        readLine()
    }
}

class Admin(override val access: String) : Users(), Deletion {

    override fun read() {
        println("Пользователь $access читает")
    }

    override fun write() {
        println("Пользователь $access пишет")
    }

    override fun deleteUsers() {
        println("Администратор удалил пользователя")
    }

    override fun deleteMessage() {
        println("Администратор удалил сообщение")
    }
}