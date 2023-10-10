import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val arr = arrayOf(0, 0, 0, 0, 0, 0, 0, 0)
    val a = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val d = arrayOf(8, 7, 6, 5, 4, 3, 2, 1)

    for (i in 0..7) {
        arr[i] = sc.nextInt()
    }

    if (arr.contentEquals(a)) println("ascending")
    else if (arr.contentEquals(d)) println("descending")
    else println("mixed")
}