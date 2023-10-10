import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    if (a % 400 == 0) {
        println(1)
    }
    else if (a % 100 == 0) {
        println(0)
    }
    else if (a % 4 == 0) {
        println(1)
    }
    else {
        println(0)
    }
}