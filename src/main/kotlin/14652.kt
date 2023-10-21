import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    var d = 0
    for (i in 0 until a) {
        for (j in 0 until b) {
            if (d++ == c) {
                println("$i $j")
            }
        }
    }
}