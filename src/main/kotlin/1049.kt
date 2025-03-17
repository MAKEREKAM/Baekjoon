import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var a = 1001 /*package*/
    var b = 1001

    var c = sc.nextInt() /*wire*/
    val d = sc.nextInt()

    for (i in 1..d) {
        val e = sc.nextInt()
        val f = sc.nextInt()

        if (e < a) a = e
        if (f < b) b = f
    }

    if (a > b * 6) {
        println(c * b)
        return
    }

    var e = 0

    while (c >= 6) {
        e += a
        c -= 6
    }

    e += if (b * c > a) a else b * c

    println(e)
}