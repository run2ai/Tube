package solve.bj_1253

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val N = readLine().toInt()
    val input = StringTokenizer(readLine())
    val arr = IntArray(N) { input.nextToken().toInt() }
    var good = 0
    arr.sort()

    for (i in 0..<N) {
        val target = arr[i]
        var (start, end) = 0 to N - 1
        while (start < end) {
            val sum = arr[start] + arr[end]

            if (sum == target) {
                if (start != i && end != i) {
                    good++
                    break
                } else if (start == i) {
                    start++
                } else {
                    end--
                }
            } else if (sum > target) {
                end--
            } else {
                start++
            }
        }
    }

    print(good)
}