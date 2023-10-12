import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextInt()
    var result = ""
    for (i in 1..n) {
        val a = sc.nextInt()
        if (a < x) {
            result += "$a "
        }
    }
    println(result.substring(0, result.length - 1))
}