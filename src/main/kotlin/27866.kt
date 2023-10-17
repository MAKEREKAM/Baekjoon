import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.next()
    val b = sc.nextInt()
    println(a.toCharArray()[b - 1])
}