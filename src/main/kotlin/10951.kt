import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    while (sc.hasNextInt()) {
        println(sc.nextInt() + sc.nextInt())
    }
}