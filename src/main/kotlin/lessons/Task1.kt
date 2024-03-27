package lessons

//Создай класс, описывающий элемент викторины. В primary конструкторе два текстовых свойства: вопрос и ответ.
//Явно пропиши для вопроса геттер, для ответа геттер и сеттер.

class QuizElement(
    question: String,
    answer: String
) {
    var question = question
        get() = field

    var answer = answer
        get() = field
        set(value) {
            field = value
        }
}