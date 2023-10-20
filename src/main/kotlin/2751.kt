import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()
    val a = br.readLine().toInt()
    val b = IntArray(a)
    for (i in 0 until a) {
        b[i] = br.readLine().toInt()
    }
    for (i in b.sorted()) {
        bw.write("$i\n")
    }
    br.close()
    bw.flush()
    bw.close()
}