package chap18;

import java.util.Scanner;

public class RecursivePalindromeUsingSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        System.out.println(word + " is a palindrome: " + isPalindrome(word));
    }

    public static boolean isPalindrome(String word) {
        if (word.length() == 0 || word.length() == 1)
            return true;

        if (word.charAt(0) != word.charAt(word.length() - 1))
            return false;

        return isPalindrome(word.substring(1, word.length() - 1));
    }
}
