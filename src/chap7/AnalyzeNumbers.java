package chap7;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total numbers in the array: ");
        int length = input.nextInt();
        System.out.print("Enter the array: ");

        double[] array = new double[length];
        for (int i = 0; i < length; ++i) {
            array[i] = input.nextDouble();
        }

        double sum = 0;
        for (double i : array)
            sum += i;
        double avg = sum / length;

        int count = 0;
        for (double i : array)
            if (i > avg)
                ++count;

        System.out.printf("The average is: %.2f \n", avg);
        System.out.printf("There are %d numbers above the average \n", count);
    }
}
