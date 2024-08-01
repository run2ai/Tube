package solve.bj_1517

import java.util.*

var count = 0L
lateinit var tempArray: IntArray

fun main() = with(System.`in`.bufferedReader()) {
    val N = readLine().toInt()
    val st = StringTokenizer(readLine())
    val numbers = IntArray(N) { i ->
        st.nextToken().toInt()
    }

    tempArray = IntArray(N)
    mergeSort(numbers, 0, N-1)

    print(count)
}

fun mergeSort(numbers: IntArray, start: Int, end: Int) {
    if (start == end) return

    val mid = (start + end) / 2
    mergeSort(numbers, start, mid)
    mergeSort(numbers, mid + 1, end)
    merge(numbers, start, end) // 정렬된 양쪽 배열을 합치면서 다시 정렬한다
}

fun merge(numbers: IntArray, start: Int, end: Int) {
    val mid = (start + end) / 2
    var left = start
    var right = mid + 1
    var tempIndex = start

    while(left <= mid && right <= end) {
        if (numbers[left] <= numbers[right]){
            tempArray[tempIndex++] = numbers[left++]
        }else{
            tempArray[tempIndex++] = numbers[right++]
            count += mid - left + 1
        }
    }

    while (left <= mid) {
        tempArray[tempIndex++] = numbers[left++]
    }
    while (right <= end) {
        tempArray[tempIndex++] = numbers[right++]
    }

    for (i in start..end) {
        numbers[i] = tempArray[i]
    }
}