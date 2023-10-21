import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    for (i in 1..sc.nextInt()) {
        val a = sc.next()
        println(a.toCharArray()[0].toString() + a.toCharArray()[a.length - 1].toString())
    }
}