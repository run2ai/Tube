import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    var st = StringTokenizer(readLine())
    val N = st.nextToken().toInt()
    val M = st.nextToken().toInt()
    st = StringTokenizer(readLine())
    val arr = IntArray(N) { st.nextToken().toInt() }
    var start = arr.max()
    var end = arr.sum()
    var mid: Int
    var result = 0

    while (start <= end) {
        mid = (start + end) / 2

        var total = 0
        var count = 1

        for (i in arr) {
            if (total + i > mid) {
                count += 1
                total = 0
            }
            total += i
        }

        if(count <= M) {
            result = mid
            end = mid-1
        }else {
            start = mid+1
        }
    }

    print(result)
}
