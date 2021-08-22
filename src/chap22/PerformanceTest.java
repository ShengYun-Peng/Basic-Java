package chap22;

public class PerformanceTest {
    public static void main(String[] args) {
        getTime(1000000);
        getTime(10000000);
        getTime(100000000);
        getTime(1000000000);
    }

    public static void getTime(long n) {
        long startTime = System.currentTimeMillis();

        int k = 0;
        for (long i = 0; i < n; ++i)
            k = k + 2;

        long endTime = System.currentTimeMillis();

        System.out.println("n: " + n + " Time: " + (endTime - startTime) + " milliseconds");
    }
}
