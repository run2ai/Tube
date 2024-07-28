package bj_1427

fun main() = with(System.`in`.bufferedReader()) {
    val input = readLine()
    val inputArray = input.toCharArray()

    inputArray.sortDescending()

    print(inputArray)
}