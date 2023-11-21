import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    var b = 0L
    var c = 1L
    while (a >= b) {
        b += c
        c++
    }
    println(c - 2)
}