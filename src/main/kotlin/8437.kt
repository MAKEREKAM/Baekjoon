import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextBigInteger()
    val b = sc.nextBigInteger()
    val c = (a - b) / "2".toBigInteger()
    println(c + b)
    println(c)
}