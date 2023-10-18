import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val a = br.readLine().toInt()
    val b = IntArray(10001)
    for (i in 0 until a) {
        b[br.readLine().toInt()]++
    }
    for (i in b.indices) {
        bw.write("$i\n".repeat(b[i]))
    }
    br.close()
    bw.flush()
    bw.close()
}