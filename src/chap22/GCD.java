package chap22;

import java.util.Scanner;

public class GCD {
    public static int gcd(int m, int n) {
        if (m < n) {
            int tmp = m; m = n; n = tmp;
        }

        int remainder = m % n;
        if (remainder == 0)
            return n;
        else
            return gcd(n, remainder);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();

        System.out.println("The gcd of " + m + " and " + n + " is " + gcd(m, n));
    }
}
