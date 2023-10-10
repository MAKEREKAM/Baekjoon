import java.util.*
import kotlin.collections.HashMap

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextLine()
    val map : HashMap<Char, Int> = HashMap()

    a.forEach {
        if (map.containsKey(it.toLowerCase())) {
            map[it.toLowerCase()] = map[it.toLowerCase()]!! + 1
        }

        else {
            map[it.toLowerCase()] = 1
        }
    }

    val max = map.maxBy{it.value}
    if (map.filter{it.value == max.value}.size != 1) {
        println("?")
    }
    else {
        println(max.key.toUpperCase())
    }
}
