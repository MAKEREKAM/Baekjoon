import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    println(a * b / gcd(a, b))
}

fun gcd(a : Long, b : Long) : Long {
    if (b == 0L) return a
    if (a > b) return gcd(b, a % b)
    return gcd(a, b % a)
}