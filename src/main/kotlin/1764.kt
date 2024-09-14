import java.util.ArrayList
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()

    val c = Array<String>(a, {""})
    val d = Array<String>(b, {""})

    for (i in 1..a) {
        c[i-1] = sc.next()
    }

    for (i in 1..b) {
        d[i-1] = sc.next()
    }

    val e = c + d

    val f = e.groupBy { it }.filter { it.value.size > 1 }.flatMap { it.value }.distinct()

    val g = f.sorted()

    println(g.size)
    for (i in g) println(i)
}