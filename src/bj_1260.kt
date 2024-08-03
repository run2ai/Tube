import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    var st = StringTokenizer(readLine())
    val N = st.nextToken().toInt()
    val M = st.nextToken().toInt()
    val V = st.nextToken().toInt()
    val sb = StringBuilder()
    var visit = Array(N + 1) { false }
    val branch = Array(N + 1) { Array(N + 1) { 0 } }

    repeat(M) {
        st = StringTokenizer(readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        branch[a][b] = 1
        branch[b][a] = 1
    }

    fun dfs(start: Int) {
        visit[start] = true;
        sb.append("$start ")
        for (i in 1..N) {
            if (branch[start][i] == 1 && !visit[i]) {
                dfs(i)
            }
        }
    }

    fun bfs(start: Int) {
        var queue : Queue<Int> = LinkedList()
        queue.add(start)
        visit[start] = true
        sb.append("$start ")

        while (!queue.isEmpty()) {
            val temp = queue.poll()

            for(i in 1..<branch.size) {
                if(branch[temp][i] == 1 && !visit[i]){
                    queue.add(i)
                    visit[i] = true
                    sb.append("$i ")
                }
            }
        }
    }

    dfs(V)
    sb.appendLine()
    visit = Array(N+1) { false };
    bfs(V)

    print(sb)
}