fun main() {
    val dividend = readln().toInt()
    val list = listOf("2", "3", "5", "6")

    for (value in list) {
        if (dividend % value.toInt() == 0) println("Divided by $value")
    }
}