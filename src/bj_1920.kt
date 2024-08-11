import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val N = readLine().toInt()
    var st = StringTokenizer(readLine())
    val arr = IntArray(N) { st.nextToken().toInt() }
    val M = readLine().toInt()
    st = StringTokenizer(readLine())
    val sb = StringBuilder()

    arr.sort()

    repeat(M) { i ->
        sb.appendLine(binarySearch(arr, st.nextToken().toInt()))
    }

    print(sb)
}

fun binarySearch(arr: IntArray, target: Int): Int {
    var start = 0
    var end: Int = arr.size - 1
    var mid: Int

    while (start < end) {
        mid = (start + end) / 2;
        if (target <= arr[mid]) {
            end = mid
        } else {
            start = mid + 1
        }
    }
    if (arr[start] == target) return 1
    else return 0
}