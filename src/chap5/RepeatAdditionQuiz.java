package chap5;

import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);

        System.out.printf("What is the result of %d + %d? \n", num1, num2);
        int result = input.nextInt();
        while (result != num1 + num2) {
            System.out.printf("What is the result of %d + %d? \n", num1, num2);
            result = input.nextInt();
        }
    }
}
