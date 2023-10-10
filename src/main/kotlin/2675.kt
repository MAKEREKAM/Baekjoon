import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    for (i in 1..sc.nextInt()) {
        val a = sc.nextInt()
        val b = sc.next()

        var c = ""
        b.forEach {
            c += it.toString().repeat(a)
        }
        println(c)
    }
}