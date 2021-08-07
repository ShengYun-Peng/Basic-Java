package chap3;

import org.omg.CORBA.AnySeqHelper;

import java.util.Random;
import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        int randomNum1 = (int) (Math.random() * 10);
        int randomNum2 = (int) (Math.random() * 10);

        if (randomNum1 < randomNum2) {
            int tmp = randomNum1;
            randomNum1 = randomNum2;
            randomNum2 = tmp;
        }

        System.out.println("What is " + randomNum1 + " - " + randomNum2 + "?");

        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (answer == (randomNum1 - randomNum2)) {
            System.out.println("The answer is correct!");
        } else {
            System.out.println("The answer is wrong!");
        }
    }
}
