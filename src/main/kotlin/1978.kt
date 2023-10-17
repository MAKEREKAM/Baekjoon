import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    var result = 0
    for (i in 1..a) {
        if (checkPrime(sc.nextInt())) result++
    }
    println(result)
}

fun checkPrime(a : Int) : Boolean {
    if (a == 1) return false
    for (i in 2..(a + 1) / 2) {
        if (a % i == 0) {
            return false
        }
    }

    return true
}