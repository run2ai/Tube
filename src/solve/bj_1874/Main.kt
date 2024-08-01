package solve.bj_1874

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val N = readLine().toInt()
    val intArray = IntArray(N)
    val stack = mutableListOf<Int>()
    var num = 1
    var searchNum = 0

    repeat(N) { i ->
        intArray[i] = readLine().toInt()
    }


    while (true) {
        if (stack.isNotEmpty() && intArray[searchNum] == stack.last()) {
            stack.remove(stack.last())
            sb.appendLine('-')
            searchNum++
        } else {
            stack.add(num++)
            sb.appendLine('+')
        }

        if (searchNum == N || num > N+1) break
    }

    if (stack.isNotEmpty()) {
        print("NO")
    } else {
        print(sb)
    }
}