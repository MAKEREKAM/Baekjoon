import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b : ArrayList<String> = ArrayList()
    for (i in 1..a) {
        val d = sc.next()
        if (!b.contains(d)) b.add(d)
    }
    var count = 1
    var e = 0

    while (true) {
        if (e == b.size) return
        val d : ArrayList<String> = ArrayList()
        b.forEach {
            if (it.length == count) {
                d.add(it)
                e++
            }
        }
        d.sort()

        d.forEach {
            println(it)
        }

        count++
    }
}