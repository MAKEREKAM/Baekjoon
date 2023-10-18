import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.next()
    var result = 0L
    var pow = 1L
    b.forEach {
        val c = it.toLong() - 96
        result += c * pow
        pow = (pow * 31) % 1234567891
    }
    println(result % 1234567891)
}