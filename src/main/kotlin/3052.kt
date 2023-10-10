import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var count = 0
    val list : ArrayList<Int> = ArrayList()
    for (i in 1..10) {
        val a = sc.nextInt()
        if (!list.contains(a % 42)) {
            list.add(a % 42)
            count++
        }
    }
    println(count)
}