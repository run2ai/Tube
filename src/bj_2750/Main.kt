package bj_2750

fun main() = with(System.`in`.bufferedReader()){
    val N = readLine().toInt()
    val arr = IntArray(N)
    val sb = StringBuilder()

    repeat(N) {
        arr[it] = readLine().toInt()
    }

    arr.sort()

    repeat(N) {
    sb.appendLine(arr[it])
    }
    print(sb)
}