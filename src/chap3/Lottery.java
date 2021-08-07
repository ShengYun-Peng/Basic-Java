package chap3;

import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Random random = new Random();
        int results = random.nextInt(100);

        int digit1 = results % 10;
        int digit2 = results / 10;

        Scanner input = new Scanner(System.in);
        int prediction = input.nextInt();

        int pred1 = prediction % 10;
        int pred2 = prediction / 10;

        System.out.println("Results: " + results + ", prediction: " + prediction);
        if (pred1 == digit1 && pred2 == digit2) {
            System.out.println("You won 10000");
        } else if (pred1 == digit2 && pred2 == digit1) {
            System.out.println("You won 3000");
        } else if (pred1 == digit1 || pred1 == digit2 || pred2 == digit1 || pred2 == digit2) {
            System.out.println("You won 1000");
        } else {
            System.out.println("You lose");
        }
    }
}
