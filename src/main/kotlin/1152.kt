import java.util.Scanner
import java.util.StringTokenizer

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextLine()
    println(StringTokenizer(a, " ").countTokens())
}