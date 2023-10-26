import java.io.BufferedReader
import java.io.InputStreamReader

fun gcd(a : Long, b : Long) : Long {
    if (b == 0L) return a
    if (a > b) return gcd(b, a % b)
    return gcd(a, b % a)
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()
    val c = br.readLine().split(" ")
    val a = c[0].toLong()
    val b = c[1].toLong()

    for (i in 1..gcd(a, b)) {
        bw.write("1")
    }

    br.close()
    bw.flush()
    bw.close()
}