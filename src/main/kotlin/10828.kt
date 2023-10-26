import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val a : Stack<Int> = Stack()

    for (i in 1..br.readLine().toInt()) {
        val b = br.readLine().split(" ")
        if (b[0] == "push") {
            a.push(b[1].toInt())
        }
        else if (b[0] == "pop") {
            if (a.isEmpty()) bw.write("-1\n")
            else bw.write(a.pop().toString() + "\n")
        }
        else if (b[0] == "size") {
            bw.write(a.size.toString() + "\n")
        }
        else if (b[0] == "empty") {
            if (a.isEmpty()) bw.write("1\n")
            else bw.write("0\n")
        }
        else {
            if (a.isEmpty()) bw.write("-1\n")
            else bw.write(a.peek().toString() + "\n")
        }
    }

    br.close()
    bw.flush()
    bw.close()
}