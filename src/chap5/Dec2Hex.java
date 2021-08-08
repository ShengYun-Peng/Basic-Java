package chap5;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int dec = input.nextInt();
        int tmp = dec;

        String hex = "";
        while (tmp != 0) {
            int remainder = tmp % 16;
            if (remainder >= 10) {
                hex = (char) (remainder - 10 + 'A') + hex;
            } else {
                hex = "" + remainder + hex;
            }
            tmp = tmp / 16;
        }

        System.out.printf("The hex of %d is %s \n", dec, hex);
    }
}
