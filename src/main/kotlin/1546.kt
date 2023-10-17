import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b : ArrayList<Int> = ArrayList()
    for (i in 1..a) {
        b.add(sc.nextInt())
    }
    val max = b.max()
    var sum : Double = 0.0
    b.forEach {
        sum += (it.toDouble() / max.toDouble()) * 100
    }
    println(sum / b.size)
}