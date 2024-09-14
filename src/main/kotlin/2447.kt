import java.util.*
import java.io.*

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    val a = br.readLine().toInt()
    for (b in 0..a - 1) {
        for (c in 0..a - 1) {
            printStar(b, c, a / 3)
        }

        bw.write("\n")
    }

    bw.flush()
    bw.close()
}

fun printStar(a : Int, b : Int, c : Int) {
    if ((a / c) % 3 == 1 && (b / c) % 3 == 1) {
        bw.write(" ")
    }
    else if (c / 3 == 0) {
        bw.write("*")
    }
    else {
        printStar(a, b, c / 3)
    }
}