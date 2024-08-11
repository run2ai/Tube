import java.util.*

data class Node(val x: Int, val y: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    val N = st.nextToken().toInt()
    val M = st.nextToken().toInt()
    val visited = Array(N) { BooleanArray(M) { false } }
    val dx = arrayOf(0, 0, -1, 1)
    val dy = arrayOf(-1, 1, 0, 0)

    val maze = Array(N) { IntArray(M) { 0 } }


    repeat(N) { i ->
        val input = readLine()
        repeat(M) { j ->
            maze[i][j] = input[j] - '0'
        }
    }

    fun bfs(x: Int, y: Int) {
        val queue: Queue<Node> = LinkedList()
        queue.offer(Node(x, y))
        visited[x][y] = true

        while (!queue.isEmpty()) {
            val currentNode = queue.poll()

            for (i in 0..<4) {
                val nextX = currentNode.x + dx[i]
                val nextY = currentNode.y + dy[i]

                // 범위 내에 있는가
                if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= M)
                    continue
                // 막힌길(0)인가
                if (maze[nextX][nextY] == 0)
                    continue
                // 이미 방문했는가
                if (visited[nextX][nextY])
                    continue
                queue.offer(Node(nextX, nextY))
                visited[nextX][nextY] = true
                maze[nextX][nextY] = maze[currentNode.x][currentNode.y] + 1
            }
        }
    }

    bfs(0, 0)
    print(maze[N - 1][M - 1])
}