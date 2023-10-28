import java.util.Scanner
import kotlin.math.sqrt

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = BooleanArray(b + 1){true}

    for (i in 2..sqrt((b + 1).toDouble()).toInt()) {
        if (!c[i]) continue

        for (j in a..b) {
            if (j != i && j % i == 0) c[j] = false
        }
    }

    for (i in a..b) {
        if (c[i] && i > 1) println(i)
    }
}