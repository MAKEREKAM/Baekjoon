import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = a(a, b)
    val d = (a * b) / c

    println(c)
    println(d)
}

fun a(a: Int, b:Int): Int {
    if (b != 0) return a(b, a % b) else return a
}