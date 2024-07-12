package bj_1940

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val N = readLine().toInt()
    val M = readLine().toInt()
    val input = StringTokenizer(readLine())
    val inputArray = IntArray(N) {
        input.nextToken().toInt()
    }
    var (s, e) = 0 to N - 1
    var result = 0

    inputArray.sort()

//    for (i in 0..<inputArray.size - 1) {
//        for (j in 0..<inputArray.size - 1 - i) {
//            if (inputArray[j] > inputArray[j + 1]) {
//                val temp = inputArray[j]
//                inputArray[j] = inputArray[j + 1]
//                inputArray[j + 1] = temp
//            }
//        }
//    }

    while (s < e) {
        val sum = inputArray[s] + inputArray[e]
        if (sum == M) {
            result++
            s++
        }
        if (sum < M) {
            s++
        }
        if (sum > M) {
            e--
        }
    }

    print(result)
}