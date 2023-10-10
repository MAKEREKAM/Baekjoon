import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var a = sc.nextInt()
    a *= sc.nextInt()
    a *= sc.nextInt()
    val b = a.toString()

    for (i in '0'..'9') {
        var count = 0
        b.forEach {
            if (it == i) count++
        }
        println(count)
    }
}