import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    for (i in 1..a) {
        val b = sc.nextLong()
        val c = sc.nextLong()
        println(b + c)
    }
}