import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    while (sc.hasNextInt()) {
        val a = sc.nextInt()
        val b = sc.nextInt()
        println(b / (a + 1))
    }
}