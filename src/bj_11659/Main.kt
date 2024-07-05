import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val inputInfo = StringTokenizer(readLine())
    val N = inputInfo.nextToken().toInt()
    val M = inputInfo.nextToken().toInt()
    val sumArray = IntArray(N + 1)
    val inputData = StringTokenizer(readLine())
    val str = StringBuilder()

    repeat(N) { i -> sumArray[i + 1] = sumArray[i] + inputData.nextToken().toInt() }
    repeat(M) { i ->
        val range = StringTokenizer(readLine())
        val start = range.nextToken().toInt()
        val end = range.nextToken().toInt()

        str.appendLine(sumArray[end] - sumArray[start - 1])
    }

    bw.write(str.toString())
    bw.close()
    close()
}