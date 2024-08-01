fun main() = with(System.`in`.bufferedReader()) {
    val N = readLine().toInt()
    val arr = IntArray(10001)
    val sb = StringBuilder()

    repeat(N) {
        val input = readLine().toInt()
        arr[input] += 1
    }

    repeat(10001) { i ->
        repeat(arr[i]) {
            sb.appendLine(i)
        }
    }

    print(sb)
}