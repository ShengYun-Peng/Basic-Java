package chap12;

import java.util.Scanner;

public class Quotient {
    public static int quotient(int num1, int num2) {
        if (num2 == 0) {
            System.exit(1);
        }

        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int quotient = quotient(num1, num2);
        System.out.printf("The quotient of %d and %d is: %d\n", num1, num2, quotient);
    }
}
