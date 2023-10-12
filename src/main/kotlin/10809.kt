import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.next()
    val map : HashMap<Char, Int> = HashMap()
    var count = 0

    a.forEach {
        if (!map.containsKey(it)) {
            map[it] = count
        }
        count++
    }

    var result = ""

    for (i in 97..122) {
        if (!map.containsKey(i.toChar())) {
            result += "-1 "
        }
        else {
            result += "${map[i.toChar()]} "
        }
    }

    println(result.substring(0, result.length - 1))
}