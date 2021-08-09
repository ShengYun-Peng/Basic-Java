package chap6;

import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    public static int gcd(int num1, int num2) {
        int gcd = 1;
        int k = 2;

        while (k <= num1 && k <= num2) {
            if (num1 % k == 0 && num2 % k == 0) {
                gcd = k;
            }
            ++k;
        }

        return gcd;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter to numbers to compute the GCD: ");
        int val1 = input.nextInt();
        int val2 = input.nextInt();

        System.out.printf("The gcd of %d and %d is %d", val1, val2, gcd(val1, val2));
    }
}
