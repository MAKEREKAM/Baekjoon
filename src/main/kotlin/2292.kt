import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()

    if (a == 1) {
        println(1)
        return
    }

    var result = 2
    var length = 7
    var count = 12

    while (true) {
        if (a <= length) {
            println(result)
            break
        }

        result++
        length += count
        count += 6
    }
}