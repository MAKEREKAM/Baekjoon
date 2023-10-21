import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    var b = 0
    for (i in 1..a) {
        b += i
    }
    println(b)
}