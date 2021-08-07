package chap6;

public class Example1 {
    public static int sum(int a1, int a2) {
        int sum = 0;
        for (int i = a1; i < a2; ++i)
            sum += i;

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 10));
    }
}
