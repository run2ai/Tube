package bj_12891

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val input = StringTokenizer(readLine())
    val (S, P) = input.nextToken().toInt() to input.nextToken().toInt()
    val str = readLine()
    val arrInput = StringTokenizer(readLine())
    val rule = mapOf<String, Int>(
        "A" to arrInput.nextToken().toInt(),
        "C" to arrInput.nextToken().toInt(),
        "G" to arrInput.nextToken().toInt(),
        "T" to arrInput.nextToken().toInt()
    )
    var result = 0

    repeat(S - P + 1) { i ->
        var a = 0
        var c = 0
        var g = 0
        var t = 0

        val checkString = str.substring(i, i + P)
        for (element in checkString) {
            when (element) {
                'A' -> a++
                'C' -> c++
                'G' -> g++
                'T' -> t++
            }
        }

        if (a >= rule.getValue("A") && c >= rule.getValue("C") && g >= rule.getValue("G") && t >= rule.getValue("T")) {
            result++
        }
    }
    print(result)
}