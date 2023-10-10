import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val arr : ArrayList<Int> = ArrayList()
    for (i in 0..8) {
        arr.add(sc.nextInt())
    }
    println(arr.max())
    println(arr.indexOf(arr.max()) + 1)
}