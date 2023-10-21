import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = IntArray(3)
    for (i in 0 until 3) {
        a[i] = sc.nextInt()
    }
    println(a.sorted()[1])
}