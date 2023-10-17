import java.util.Scanner
import kotlin.math.pow

fun main() {
    val sc = Scanner(System.`in`)
    var answer = ""
    while (true) {
        val a = sc.nextInt()
        val b = sc.nextInt()
        val c = sc.nextInt()

        val aa = arrayOf(a, b, c).min()
        val cc = arrayOf(a, b, c).max()
        val bb = (a + b + c) - (aa + cc)

        if (a == 0 && b == 0 && c == 0) {
            print(answer)
            break
        }

        if (aa.toDouble().pow(2) + bb.toDouble().pow(2) == cc.toDouble().pow(2)) {
            answer += "right\n"
        }
        else {
            answer += "wrong\n"
        }
    }
}