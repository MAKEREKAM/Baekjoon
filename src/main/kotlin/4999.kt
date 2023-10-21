import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.next().length
    val b = sc.next().length
    println(if (a >= b) { "go" } else { "no" })
}