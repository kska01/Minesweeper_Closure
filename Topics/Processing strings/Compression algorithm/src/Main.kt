fun main() {
    val str = readln()
    var string = str
    var i = 0
    val countList = mutableListOf<Int>()
    val charList = mutableListOf<Char>()

    while (string.isNotEmpty()) {
        charList.add(string.first())
        countList.add(charCount(string))
        string = newString(string, countList[i])
        i++
    }

    repeat(charList.size) {
        print("${charList[it]}${countList[it]}")
    }
}

fun charCount(str: String): Int {
    val char = str.first()
    var count = 0

    for (ch in str) {
        if (char == ch) count++ else break
    }

    return count
}

fun newString(str: String, num: Int) = str.drop(num)
