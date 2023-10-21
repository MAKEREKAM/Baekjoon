import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    for (i in 1..a) {
        val b = sc.nextInt()
        val c = sc.nextInt()
        println("Case #$i: $b + $c = ${b + c}")
    }
}