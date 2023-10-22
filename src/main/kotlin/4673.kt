fun main() {
    for (i in 1..10000) {
        var b = true
        for (j in 1..i) {
            var a = j
            j.toString().forEach {
                a += it.toString().toInt()
            }
            if (a == i) {
                b = false
                break
            }
        }
        if (b) println(i)
    }
}