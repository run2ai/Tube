package solve.bj_2751


fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val N = readLine().toInt()
    val list = ArrayList<Int>()

    repeat(N) {
        list.add(readLine().toInt())
    }

    list.sort()
    list.map { i ->
        sb.appendLine(i)
    }

    print(sb)
}