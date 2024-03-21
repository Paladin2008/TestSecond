package Lessons

//Создай класс, описывающий заказ в интернет-магазине. В заказе должны быть
//номер заказа и статус готовности. Номер заказа должен быть недоступен для изменения.
//Создай метод, который меняет статус заказа. Поменять статус заказа можно
//только отправив заявку менеджеру. Имитируй это действие отдельной публичной функцией.
//Она будет принимать новый статус и обращаться к внутреннему методу класса для изменения статуса.
fun main() {

    val order = Order(123)
    order.sendRequest(true)
    println("Готовность ${order.changeStatus()}")
}


class Order(private val number: Int, var status: Boolean = false) {

    fun changeStatus(): Boolean {
        println("Номер заказа $number")
        return status
    }

    fun sendRequest(ready: Boolean) {
        status = ready
    }
}