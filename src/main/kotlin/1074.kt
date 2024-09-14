import java.io.BufferedReader
import java.io.InputStreamReader

var f = 0
var g = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val input = readln().split(" ").map{ it.toInt() }
    val (a, b, c) = input

    br.close()

    find(1 shl(a), 0, 0, b, c)

    bw.write(f.toString())
    bw.flush()
    bw.close()
}

fun find(a : Int, b : Int, c : Int, d : Int, e : Int) {
    if (b == d && c == e) {
        f = g
        return
    }

    if (d !in b until b + a || e !in c until c + a) {
        g += a * a
        return
    }

    val h = a / 2

    find(h, b, c, d, e)
    find(h, b, c + h, d, e)
    find(h, b + h, c, d, e)
    find(h, b + h, c + h, d, e)
}