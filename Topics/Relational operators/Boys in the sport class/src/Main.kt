const val THREE = 3

fun main() {
    val listOfHeight = MutableList(THREE) { readln() }

    println(
        if (listOfHeight[0] <= listOfHeight[1] && listOfHeight[1] <= listOfHeight[2]) {
            "true"
        } else if (listOfHeight[0] >= listOfHeight[1] && listOfHeight[1] >= listOfHeight[2]) {
            "true"
        } else "false"
    )

}