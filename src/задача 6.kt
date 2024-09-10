fun main() {
    var num1 = readln()
    var num2 = readln()
    if ((num1 + num2).toInt() % 2 != 0) {
        println(num1 + num2)
    } else if
        ((num2 + num1).toInt() % 2 != 0) {
            println(num2 + num1)
    }
    else if ((num1.toInt() + num2.toInt()) % 2 != 0){
        println(num1.toInt() + num2.toInt())
    }
    else if ((num1.toInt() * num2.toInt()) % 2 != 0){
        println(num1.toInt() * num2.toInt())
    }

    else ( println("Создать нечетное число невозможно"))

}