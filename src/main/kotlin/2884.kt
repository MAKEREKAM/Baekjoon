import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    if (b < 45) {
        println("${if (a == 0) {23} else {a - 1}} ${b + 15}")
    }
    else {
        println("$a ${b - 45}")
    }
}