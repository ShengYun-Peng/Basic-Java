package chap3;

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inputNum = input.nextInt();
        if (inputNum % 5 == 0) {
            System.out.println("HiFive");
        }

        if (inputNum % 2 == 0) {
            System.out.println("HiEven");
        }
    }
}
