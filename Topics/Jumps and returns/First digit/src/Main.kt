fun main() {
    val str = readln()

    for (ch in str) {
        if (ch in "0123456789") {
            println(ch)
            return
        }
    }
}