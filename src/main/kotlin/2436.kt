//import java.util.Scanner
//
//fun main() {
//    val sc = Scanner(System.`in`)
//    val a = sc.nextInt()
//    var b = sc.nextInt()
//    b /= a
//
//    var c = 0; var d = 0
//
//    var i = 1
//    while (i * i <= b) {
//        if (b % i == 0 && gcd(i, b / i) == 1) {
//            c = i; d = b / i
//        }
//        i++
//    }
//
//    c *= a; d *= a
//
//    println("$c $d")
//}
//
//fun gcd(a : Int, b : Int) : Int {
//    if (b == 0) return a
//    if (a > b) return gcd(b, a % b)
//    return gcd(a, b % a)
//}