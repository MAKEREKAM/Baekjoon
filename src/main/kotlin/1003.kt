import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val a = br.readLine().toInt()

    val b = Array<Int>(50, {0})
    b[1] = 1
    for (i in 2..40) {
        b[i] = b[i - 2] + b[i - 1]
    }

    for (i in 1..a) {
        val c = br.readLine().toInt()
        if (c == 0) bw.append("1 0\n")
        else bw.append("${b[c - 1]} ${b[c]}\n")
    }

    bw.flush()
    bw.close()
}