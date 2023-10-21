import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = IntArray(a)
    for (i in 0 until a) {
        b[i] = sc.nextInt()
    }
    val c = sc.nextInt()
    var d = 0
    for (i in b) {
        if (i == c) d++
    }
    println(d)
}