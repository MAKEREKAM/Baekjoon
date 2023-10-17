import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    for (i in 1..a) {
        var result = i
        i.toString().forEach {
            result += it.toString().toInt()
        }

        if (result == a) {
            println(i)
            return
        }
    }

    println(0)
}