package bj_1377

import kotlin.math.max

data class Info(val index: Int, val value: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val N = readLine().toInt()
    var arr = Array<Info>(N + 1) { Info(0, 0) }

    repeat(N) {
        arr[it + 1] = Info(it + 1, readLine().toInt())
    }

    // info의 value 기준으로 정렬
    arr.sortWith(kotlin.Comparator { o1, o2 -> o1.value.compareTo(o2.value) })

    var max = 0
    for (i in 1..<arr.size) {
        // 과거 인덱스와 현재 인덱스를 비교
        max = max(max, arr[i].index - i)
    }

    print(max + 1)
}