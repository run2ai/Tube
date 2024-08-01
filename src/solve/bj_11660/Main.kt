package solve.bj_11660

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()){
    val inputData = StringTokenizer(readLine())
    val tableSize = inputData.nextToken().toInt()
    val tcNum = inputData.nextToken().toInt()
    val sumArray = Array(tableSize+1) { IntArray(tableSize + 1) { 0 } }
    val sb = StringBuilder()

    for(i in 1..tableSize){
        val rows = StringTokenizer(readLine());
        for(j in 1..tableSize) {
            sumArray[i][j] = sumArray[i-1][j] + sumArray[i][j-1] + rows.nextToken().toInt() - sumArray[i-1][j-1]
        }
    }

    repeat(tcNum) { i ->
        val location = StringTokenizer(readLine())
        val x1 = location.nextToken().toInt()
        val y1 = location.nextToken().toInt()
        val x2 = location.nextToken().toInt()
        val y2 = location.nextToken().toInt()

        sb.appendLine(sumArray[x2][y2] - sumArray[x1-1][y2] - sumArray[x2][y1-1] + sumArray[x1-1][y1-1])
    }
    print(sb)
}