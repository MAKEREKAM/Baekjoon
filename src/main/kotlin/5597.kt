import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a : ArrayList<Int> = ArrayList()
    for (i in 1..30) {
        a.add(i)
    }
    for (i in 1..28) {
        a.remove(sc.nextInt())
    }
    println(a[0])
    println(a[1])
}