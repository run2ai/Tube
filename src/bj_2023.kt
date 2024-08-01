fun main() = with(System.`in`.bufferedReader()) {
    val N = readLine().toInt()
    val sb = StringBuilder()

    fun isPrime(num: Int): Boolean {
        for (i in 2..<num) {
            if (num % i == 0) return false
        }
        return num > 1
    }

    fun dfs(current: Int, num: Int) {
        if (num == 0) {
            if (isPrime(current)) sb.append("$current\n")
            return
        }
        for (i in 0..<10) {
            val next = current * 10 + i
            if (isPrime(next)) dfs(next, num - 1)
        }
    }

    dfs(0, N)

    print(sb)
}

