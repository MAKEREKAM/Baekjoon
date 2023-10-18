import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    var b = 0

    for (i in 1..a) {
        var c = i

        while (c % 5 == 0 && c > 0) {
            c /= 5
            b++
        }
    }

    println(b)
}