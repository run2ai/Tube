package solve.bj_12891

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val input = StringTokenizer(readLine())
    val (S, P) = input.nextToken().toInt() to input.nextToken().toInt()
    val str = readLine()
    val rule = StringTokenizer(readLine())
    val (ruleA, ruleC, ruleG, ruleT) = Array(4) { rule.nextToken().toInt() }
    var (cntA, cntC, cntG, cntT) = IntArray(4) { 0 }
    var result = 0
    var ptr = P

    repeat(P) {
        when (str[it]) {
            'A' -> cntA++
            'C' -> cntC++
            'G' -> cntG++
            'T' -> cntT++
        }
    }

    if (ruleA <= cntA && ruleC <= cntC && ruleG <= cntG && ruleT <= cntT) result++

    while (S > ptr) {
        when (str[ptr]) {
            'A' -> cntA++
            'C' -> cntC++
            'G' -> cntG++
            'T' -> cntT++
        }

        when (str[ptr - P]) {
            'A' -> cntA--
            'C' -> cntC--
            'G' -> cntG--
            'T' -> cntT--
        }
        ptr++

        if (ruleA <= cntA && ruleC <= cntC && ruleG <= cntG && ruleT <= cntT) result++
    }

    print(result)
}