package chap12;

import java.util.Scanner;

public class QuotientWithException {
    public static int quotient(int num1, int num2) {
        if (num2 == 0)
            throw new ArithmeticException("Divisor cannot be zero!");
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        try {
            int quotient = quotient(num1, num2);
            System.out.printf("The quotient of %d and %d is: %d\n", num1, num2, quotient);
        } catch (ArithmeticException ex) {
            System.out.println("Exception: an integer cannot be divided by zero!");
        }

        System.out.println("Execution continues ...");
    }
}
