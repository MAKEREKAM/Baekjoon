import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    println(factorial(a))
}

fun factorial(a : Int) : Int {
    if (a == 0 || a == 1) return 1
    return factorial(a - 1) * a
}