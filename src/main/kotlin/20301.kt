import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val d = sc.nextInt()
    val c : ArrayList<Int> = ArrayList()
    for (i in 1..a) {
        c.add(i)
    }

    var count = 0
    var dir = true
    var e = 0

    while (!c.isEmpty()) {
        if (dir) {
            count += (b - 1)
            while (count >= c.size) count -= c.size
        }

        else {
            count -= (b)
            while (count < 0) count += c.size
        }

        e++

        if (e % d == 0) {
            dir = !dir
        }

        println(c[count])
        c.removeAt(count)
    }
}