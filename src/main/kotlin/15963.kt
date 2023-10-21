import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextBigInteger()
    val b = sc.nextBigInteger()
    if (a == b) println(1) else println(0)
}