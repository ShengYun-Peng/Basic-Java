package chap5;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int data = input.nextInt();
        while (data != 0) {
            System.out.println("Enter 0 to stop");
            sum += data;
            data = input.nextInt();
        }

        System.out.println("The sum is " + sum);


    }
}
