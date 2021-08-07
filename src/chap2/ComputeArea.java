package chap2;

import java.util.Scanner;


public class ComputeArea {
    static final double PI = 3.14;

    public static void main(String[] args) {
        // Step 1: read in radius
        // Use scanner class to hold the input, and the nextDouble method to read the value
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double area;

        // Step 2: compute area
        area = PI * radius * radius;

        // Step 3: display results
        System.out.println("radius " + area);
    }
}
