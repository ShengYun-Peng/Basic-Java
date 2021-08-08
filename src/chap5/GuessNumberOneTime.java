package chap5;

import java.util.Scanner;

public class GuessNumberOneTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 100);

        System.out.println("Please enter a number between 0 to 100");
        int guess = input.nextInt();

        while (guess != number) {
            if (guess < number)
                System.out.println("It is too low!");
            else
                System.out.println("It is too high!");
            guess = input.nextInt();
        }

        System.out.println("You got it! The number is " + number);

    }
}
