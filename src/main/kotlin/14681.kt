import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    if (a > 0 && b > 0) println(1)
    if (a < 0 && b > 0) println(2)
    if (a < 0 && b < 0) println(3)
    if (a > 0 && b < 0) println(4)
}