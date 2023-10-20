import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.next()
    var b = ""

    a.forEach {
        if (it.isUpperCase()) {
            b += it.lowercase()
        }
        else {
            b += it.uppercase()
        }
    }
    println(b)
}