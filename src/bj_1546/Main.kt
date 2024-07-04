package bj_1546

fun main() = with(System.`in`.bufferedReader()) {
    val num = readLine()
    val inputs = readLine().split(' ').toMutableList()
    var maxScore: Int = 0
    var scoreSum: Double = 0.0

    for (i in inputs) {
        if (maxScore < i.toInt()) {
            maxScore = i.toInt()
        }
    }

    inputs.forEach { s ->
        scoreSum += s.toDouble() / maxScore * 100
    }

    print(scoreSum / num.toInt())
}