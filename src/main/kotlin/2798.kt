import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c : ArrayList<Int> = ArrayList()

    for (i in 1..a) {
        c.add(sc.nextInt())
    }

    var max = 0

    for (i in 0..a - 3) {
        for (j in i + 1..a - 2) {
            for (k in j + 1..a - 1) {
                val d = c[i] + c[j] + c[k]
                if (d <= b && d > max) {
                    max = d
                }
            }
        }
    }

    println(max)
}