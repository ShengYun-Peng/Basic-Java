package chap4;

import java.util.Scanner;

public class ComputeAngle {
    public static double computeLength(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static double computeAngle(double a, double b, double c) {
        return Math.acos((a * a - b * b - c * c) / (-2 * b * c));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter (x1, y1), (x2, y2), (x3, y3): ");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double a = computeLength(x2, x3, y2, y3);
        double b = computeLength(x1, x3, y1, y3);
        double c = computeLength(x1, x2, y1, y2);

        double angleA = Math.toDegrees(computeAngle(a, b, c));
        double angleB = Math.toDegrees(computeAngle(b, a, c));
        double angleC = Math.toDegrees(computeAngle(c, b, a));

        System.out.println("Angle A: " + angleA + ", Angle B: " + angleB + ", Angle C: " + angleC);
    }
}
