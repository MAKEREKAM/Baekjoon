import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var a = sc.nextInt()

    var count = 665
    while (a != 0) {
        count++
        if (count.toString().contains("666")) {
            a--
        }
    }

    println(count)
}