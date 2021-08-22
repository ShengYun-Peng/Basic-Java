package chap22;

import java.util.Scanner;

public class ImprovedFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("Fibonacci at index: " + n + " is " + fib(n));
    }

    public static int fib(int n) {
        int f0 = 0;
        int f1 = 1;

        if (n == 0)
            return f0;
        else if (n == 1)
            return f1;
        else {
            for (int i = 1; i < n; ++i) {
                int tmp = f1;
                f1 = f0 + f1;
                f0 = tmp;
            }
            return f1;
        }
    }
}
