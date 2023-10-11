import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    for (i in 1..sc.nextInt()) {
        val a = sc.next()
        var score = 0
        var count = 0
        a.forEach {
            if (it == 'O') {
                score += count + 1
                count++
            }
            else {
                count = 0
            }
        }
        println(score)
    }
}