import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.next()
    var result = 0
    b.forEach {
        result += it.toString().toInt()
    }
    println(result)
}