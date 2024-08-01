package solve.bj_11720

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = br.readLine()
    val input = br.readLine()
    var result = 0;

    for(i: Int in 0..<num.toInt()){
        result += input.substring(i,i+1).toInt()
    }

    bw.write("$result")

    br.close()
    bw.close()
}