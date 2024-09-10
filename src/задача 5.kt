import kotlin.math.pow
fun main() {
    var n = readln().toInt()
    var x = readln().toInt()
    var y = 2
    while (y < 1000) {
        if (x.toDouble().pow(y).toInt() == n) {
            println("Целочисленный показатель степени y равен $y")
            return

        }
        y++

    }
    println("Целочисленный показатель не существует")
}