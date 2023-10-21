import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = mutableSetOf<Long>()
    for (i in 0 until a) {
        b.add(sc.nextLong())
    }
    for (i in 1..sc.nextInt()) {
        if (b.contains(sc.nextLong())) println(1) else println(0)
    }
}