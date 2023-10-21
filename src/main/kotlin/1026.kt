import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = IntArray(a)
    val c = IntArray(a)
    for (i in 0 until a) {
        b[i] = sc.nextInt()
    }
    for (i in 0 until a) {
        c[i] = sc.nextInt()
    }
    b.sort()
    c.sort()
    c.reverse()

    var result = 0
    for (i in 0 until a) {
        result += b[i] * c[i]
    }

    println(result)
}