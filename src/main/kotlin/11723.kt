import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()
    var a = IntArray(20)
    for (i in 1..br.readLine().toInt()) {
        val c = br.readLine().split(" ")
        if (c[0] == "add") {
            a[c[1].toInt() - 1] = 1
        }
        else if (c[0] == "remove") {
            a[c[1].toInt() - 1] = 0
        }
        else if (c[0] == "check") {
            bw.write(a[c[1].toInt() - 1].toString() + "\n")
        }
        else if (c[0] == "toggle") {
            a[c[1].toInt() - 1] = a[c[1].toInt() - 1] xor 1
        }
        else if (c[0] == "all") {
            a = IntArray(20){1}
        }
        else {
            a = IntArray(20)
        }
    }

    br.close()
    bw.flush()
    bw.close()
}