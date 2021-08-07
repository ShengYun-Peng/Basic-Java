package chap3;

import java.util.Scanner;

public class ComputeAndInterpretBMI {
    static final double KILOGRAMS_PER_POUND = 0.45359237;
    static final double METERS_PER_INCH = 0.0254;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your weight: ");
        double weightPound = input.nextDouble();
        System.out.print("Please enter your height: ");
        double heightInch = input.nextDouble();

        double weightKilogram = weightPound * KILOGRAMS_PER_POUND;
        double heightMeter = heightInch * METERS_PER_INCH;

        double BMI = weightKilogram / Math.pow(heightMeter, 2);

        System.out.println("Your BMI is " + BMI);
    }
}
