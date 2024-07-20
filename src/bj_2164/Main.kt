package bj_2164

fun main() = with(System.`in`.bufferedReader()){
    val N = readLine().toInt()
    val queue = ArrayDeque<Int>(N)

    repeat(N) {
        queue.add(it+1)
    }

    while(true){
        if(queue.size == 1) break
        queue.remove(queue[0])
        if(queue.size == 1) break
        queue.add(queue[0])
        queue.remove(queue[0])
    }
    print(queue[0])
}