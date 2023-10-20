import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val arr = Array(a) { IntArray(b) }
    val arr2 = Array(a) { IntArray(b) }

    for (i in 0 until a) {
        for (j in 0 until b) {
            arr[i][j] = sc.nextInt()
        }
    }

    for (i in 0 until a) {
        for (j in 0 until b) {
            arr2[i][j] = sc.nextInt()
        }
    }

    for (i in 0 until a) {
        for (j in 0 until b) {
            print("${arr[i][j] + arr2[i][j]} ")
        }
        print("\n")
    }
}