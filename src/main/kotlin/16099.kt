import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    for (i in 1..sc.nextInt()) {
        val a = sc.nextBigInteger()
        val b = sc.nextBigInteger()
        val c = sc.nextBigInteger()
        val d = sc.nextBigInteger()
        if (a * b < c * d) {
            println("Eurecom")
        }
        else if (a * b > c * d) {
            println("TelecomParisTech")
        }
        else {
            println("Tie")
        }
    }
}