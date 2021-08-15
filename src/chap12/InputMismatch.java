package chap12;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                int value = input.nextInt();
                System.out.println("The number is: " + value);
                continueInput = false;
            } catch (InputMismatchException ex) {
                StackTraceElement[] a = ex.getStackTrace();
                System.out.println(a[0].getMethodName());
                ex.printStackTrace();
                System.out.println("Try again ...");
                // skip this line and go to a new line
                input.nextLine();
            }
        } while (continueInput);

        // the divider is 0 in double computation, and doesn't cause a problem
        System.out.println(1.0/0.0);
    }
}
