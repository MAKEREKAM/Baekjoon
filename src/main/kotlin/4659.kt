import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    var d = "aeiou"

    while(true) {
        val a = br.readLine()
        if (a == "end") break

        if (!a.contains("a")) {
            if (!a.contains("e")) {
                if (!a.contains("i")) {
                    if (!a.contains("o")) {
                        if (!a.contains("u")) {
                            bw.write("<$a> is not acceptable.\n")
                            continue
                        }
                    }
                }
            }
        }

        var b = 0
        var c = 0
        var e = ""
        var f = true

        for (i in a) {
            if (d.contains(i)) {
                b++
                c = 0
            }
            else {
                c++
                b = 0
            }

            if (b == 3 || c == 3) {
                f = false
                break
            }

            if (e == i.toString()) {
                if (e != "e" && e != "o") {
                    f = false
                    break
                }
            }

            e = i.toString()
        }

        if (f) {
            bw.write("<$a> is acceptable.\n")
        }

        else {
            bw.write("<$a> is not acceptable.\n")
        }
    }

    br.close()
    bw.flush()
    bw.close()
}