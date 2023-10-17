import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = Array(15) { IntArray(15) }
    for (i in 0..14) {
        for (j in 0..14) {
            if (i * j == 0) a[i][j] = j + 1
            else a[i][j] = a[i][j-1] + a[i-1][j]
        }
    }

    for (i in 1..sc.nextInt()) {
        val b = sc.nextInt()
        val c = sc.nextInt()
        println(a[b][c - 1])
    }
}