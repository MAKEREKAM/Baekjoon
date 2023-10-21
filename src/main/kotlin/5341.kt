import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    while (true) {
        val a = sc.nextInt()
        if (a == 0) return
        var b = 0
        for (i in 1..a) {
            b += i
        }
        println(b)
    }
}