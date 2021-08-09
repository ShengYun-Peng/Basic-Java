package chap6;

import java.util.Scanner;

public class Hex2Dec {
    public static int hexToDecimal(String hex) {
        int dec = 0;
        int length = hex.length();
        for (int i = 0; i < length; ++i) {
            char bit = hex.charAt(hex.length() - 1);
            int digit = 0;
            if (bit >= '0' && bit <= '9') {
                digit = bit - '0';
            } else {
                digit = Character.toUpperCase(bit) - 'A' + 10;
            }
            dec += Math.pow(16, i) * digit;

            hex = hex.substring(0, hex.length() - 1);
        }

        return dec;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a hex value: ");
        String word = input.nextLine();
        word = word.trim();

        System.out.printf("The decimal value of %s is %d", word, hexToDecimal(word));

    }
}
