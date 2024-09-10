fun main() {
    var num1 = readln().toInt()
    var num2 = readln().toInt()
    var char = readln()
    if (char == "+") {
        println(num1 + num2)
    }
    else if (char == "-")
        {
            println(num1 - num2)
        }
        else if (char == "*")
        {
            println(num1 * num2)
        }
        else if (char == "/")
        {
            println(num1 / num2)
        }
    }