import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val line = br.readLine().split(" ")
    val a = line[0].toInt()
    val b = line[1].toInt()

    val c = br.readLine().split(" ")
    val d = br.readLine().split(" ")

    val e = IntArray(a + b)
    var f = 0

    c.forEach {
        e[f] = it.toInt()
        f++
    }

    d.forEach {
        e[f] = it.toInt()
        f++
    }

    e.sort()
    e.forEach { bw.write("$it ") }

    br.close()
    bw.flush()
    bw.close()
}