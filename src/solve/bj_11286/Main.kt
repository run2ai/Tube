package solve.bj_11286

import java.util.PriorityQueue
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    var N = readLine().toInt()
    val heap = PriorityQueue<Int> { o1, o2 -> if (abs(o1) == abs(o2)) o1 - o2 else abs(o1) - abs(o2) }

    while (N-- > 0) {
        val input = readLine().toInt()
        if (input != 0) heap.offer(input)
        else {
            if (heap.isEmpty()) sb.append(0).append('\n')
            else sb.append(heap.poll()).append('\n')
        }
    }

    print(sb)
}