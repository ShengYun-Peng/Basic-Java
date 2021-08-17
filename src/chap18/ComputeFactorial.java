package chap18;

import java.util.Scanner;

public class ComputeFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int value = input.nextInt();

        System.out.println("The factorial of " + value + " is " + factorial(value));
    }

    public static int factorial(int num) {
        if (num == 0)
            return 1;
        else
            return num * factorial(num - 1);
    }
}
