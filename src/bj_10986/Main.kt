import java.util.*

fun main() = with(System.`in`.bufferedReader()){
    var st = StringTokenizer(readLine())
    val N = st.nextToken().toInt()
    val M = st.nextToken().toInt()
    st = StringTokenizer(readLine())

    val sumArr = LongArray(N + 1) { 0 }

    for (i in 1 .. N) {
        sumArr[i] = sumArr[i - 1] + st.nextToken().toInt()
    }

    val remainderArr = LongArray(M) { 0 }
    var count = 0L
    for (i in 1 .. N) {
        val rem = sumArr[i].rem(M).toInt()
        remainderArr[rem]++
    }
    count += remainderArr[0]

    for (i in 0 ..< M) {
        count += (remainderArr[i] * (remainderArr[i] - 1)) / 2
    }
    print(count)
}