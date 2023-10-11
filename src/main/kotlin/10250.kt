fun main() {
    for (i in 1..readln().toInt()) {
        val str = readln()
        val a = str.split(" ")[0].toInt()
        val b = str.split(" ")[1].toInt()
        val c = str.split(" ")[2].toInt()

        var d = c % a
        if (d == 0) d = a
        var e = (c / a) + 1
        if (c % a == 0) e--

        println(if (e < 10) {"${d}0$e"} else {"$d$e"})
    }
}