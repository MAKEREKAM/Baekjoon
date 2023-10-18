import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(factorial(a) / (factorial(b) * factorial(a - b)))
}

fun factorial(a : Int) : Int {
    if (a == 1 || a == 0) return 1
    return factorial(a - 1) * a
}