package chap10;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();

        // create a clean string without non-alphanumeric characters
        StringBuilder cleanString = new StringBuilder();
        for (int i = 0; i < string.length(); ++i) {
            if (Character.isLetterOrDigit(string.charAt(i)))
                cleanString.append(string.charAt(i));
        }

        String temp = cleanString.toString();
        System.out.println(temp + " " + temp.equals(cleanString.reverse().toString()));
    }
}
