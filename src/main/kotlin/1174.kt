import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    if (a > 1023) {
        println(-1)
        return
    }
    val b : ArrayList<Long> = ArrayList()
    for (i in 1..1023) {
        var c = 0L
        var d = i
        for (j in 9 downTo 0) {
            if (d % 2 == 1) c = c * 10 + j
            d /= 2
        }
        b.add(c)
    }

    b.sort()

    println(b[a - 1])
}