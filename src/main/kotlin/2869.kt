import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()

    var d = (c - a) / (a - b)
    var e = d * (a - b)

    while (true)  {
        d += 1
        e += a
        if (e >= c) {
            println(d)
            break
        }
        e -= b
    }
}