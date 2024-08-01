package solve.bj_2018

fun main() = with(System.`in`.bufferedReader()){
    val N = readLine().toInt()
    var (start, end) = 0 to 0
    var (cnt, sum) = 0 to 0

    while(start <= N) {
        while(++end <= N) {
            sum += end
            if(sum >= N) {
                if(sum == N)  cnt++
                break;
            }
        }

        while (++start <= N) {
            sum -= start
            if(sum <= N) {
                if(sum == N) cnt++
                break;
            }
        }
    }

    print(cnt)
}