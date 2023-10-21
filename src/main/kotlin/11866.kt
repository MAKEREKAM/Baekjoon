import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c : ArrayList<Int> = ArrayList()
    for (i in 1..a) {
        c.add(i)
    }

    var count = 0
    var result = "<"

    while (!c.isEmpty()) {
        count += (b - 1)
        while (count >= c.size) count -= c.size

        result += "${c[count]}, "
        c.removeAt(count)
    }

    println(result.substring(0, result.length - 2) + ">")
}