const val NUMBER_OF_SHIPS = 3

fun main() {
    val x1 = "12345"
    val y1 = "12345"
    var x2 = ""
    var y2 = ""
    var resultX = ""
    var resultY = ""

    repeat(NUMBER_OF_SHIPS) {
        val input = readln()
        x2 += input.first().toString()
        y2 += input.last().toString()
    }

    for (ch in x1) {
        if (ch !in x2) resultX += ch
    }

    for (ch in y1) {
        if (ch !in y2) resultY += ch
    }

    println(resultX.toCharArray().joinToString(" "))
    println(resultY.toCharArray().joinToString(" "))
}