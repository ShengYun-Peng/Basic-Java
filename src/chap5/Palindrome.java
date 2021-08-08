package chap5;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();

        int flag = 1;
        for (int i = 0; i < word.length() / 2; ++i) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                flag = 0;
                break;
            }
        }

        if (flag == 1) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }

    }
}
