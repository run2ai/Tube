package solve.bj_2750

fun main() = with(System.`in`.bufferedReader()){
    val N = readLine().toInt()
    val arr = IntArray(N)
    val sb = StringBuilder()

    repeat(N) {
        arr[it] = readLine().toInt()
    }

    for(i in 0..<N){
        for (j in i+1..<N){
            if(arr[i] > arr[j]){
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }

    repeat(N) {
    sb.appendLine(arr[it])
    }
    print(sb)
}