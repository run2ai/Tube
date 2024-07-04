package bj_1546

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val num = readLine().toInt()
    val inputs = StringTokenizer(readLine())
    var maxScore: Int = 0
    var scoreSum: Double = 0.0

    for (i in 0..<num) {
        val score = inputs.nextToken().toInt()
        if(maxScore < score) {
            maxScore = score
        }
        scoreSum += score
    }

    print((scoreSum / maxScore * 100) / num)
}