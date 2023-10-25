import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

fun main() = with(System.out.bufferedWriter()) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a : Queue<Int> = LinkedList()

    var last = -1

    for (i in 1..br.readLine().toInt()) {
        val b = br.readLine().split(" ")
        if (b[0] == "push") {
            val c = b[1].toInt()
            a.add(c)
            last = c
        }
        else if (b[0] == "pop") {
            if (a.isEmpty()) write("-1\n")
            else write(a.poll().toString() + "\n")
        }
        else if (b[0] == "size") {
            write(a.size.toString() + "\n")
        }
        else if (b[0] == "empty") {
            if (a.isEmpty()) { write("1\n") } else { write("0\n") }
        }
        else if (b[0] == "front") {
            if (a.isEmpty()) write("-1\n")
            else write(a.peek().toString() + "\n")
        }
        else if (b[0] == "back") {
            if (a.isEmpty()) write("-1\n")
            else write(last.toString() + "\n")
        }
    }

    br.close()
    flush()
    close()
}