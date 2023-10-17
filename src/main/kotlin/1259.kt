import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    while (true) {
        val a = sc.nextInt()
        if (a == 0) return
        val b = a.toString()
        val c = b.reversed()
        if (b == c) println("yes")
        else println("no")
    }
}