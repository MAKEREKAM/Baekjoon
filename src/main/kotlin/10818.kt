import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var max = -1000000
    var min = 1000000

    for (i in 1..sc.nextInt()) {
        val a = sc.nextInt()
        if (max < a) max = a
        if (min > a) min = a
    }

    println("$min $max")
}