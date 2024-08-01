package solve.bj_11004

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    val N = st.nextToken().toInt()
    val K = st.nextToken().toInt()
    val arr = ArrayList<Int>()
    val st2 = StringTokenizer(readLine())

    repeat(N) {
        arr.add(st2.nextToken().toInt())
    }

    arr.sort()

    print(arr[K - 1])
}