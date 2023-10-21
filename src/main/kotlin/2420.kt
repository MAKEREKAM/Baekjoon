import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a : Long = sc.nextLong()
    val b : Long = sc.nextLong()
    println(if (a > b) { a - b } else { b - a })
}