import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    if (a % 5 == 0) {
        println(a / 5)
    }
    else {
        println(a / 5 + 1)
    }
}