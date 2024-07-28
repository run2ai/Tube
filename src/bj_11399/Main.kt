package bj_11399

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val N = readLine().toInt()
    val st = StringTokenizer(readLine())
    val intArray = IntArray(N) { st.nextToken().toInt() }
    var result = 0

    intArray.sort()
    repeat(N) { i->
        result += intArray[i] * (N-i)
    }

    print(result)
}