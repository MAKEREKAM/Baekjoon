import java.io.BufferedReader
import java.io.InputStreamReader

var b = 0
var c = 0
var d = false
var e = ""

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val a = br.readLine().toInt()

    for (i in 1..a) {
        e = br.readLine()

        b = 0
        c = 0
        d = false

        bw.write("${find17609()}\n")
    }

    bw.flush()
    bw.close()
}

fun find17609() : Int {
    while (b + c <= e.length - 2) {
        if (e[b] == e[e.length - (c + 1)]) {
            b++
            c++

            continue
        }

        else {
            if (d == true) {
                return 2
            }

            else {
                d = true

                val f = b
                val g = c

                b++

                val h = find17609()

                b = f
                c = g + 1

                val i = find17609()

                if (h != 2 || i != 2) break
            }
        }

    }

    return if (d) 1 else 0
}