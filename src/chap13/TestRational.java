package chap13;

import java.util.Arrays;

public class TestRational {
    public static void main(String[] args) {
        Rational r1 = new Rational(4, 2);
        Rational r2 = new Rational(2, 3);

        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " − " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
        System.out.println();

        try {
            r1 = new Rational(0, 2);
            r2 = new Rational(0, 0);

            System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
            System.out.println(r1 + " − " + r2 + " = " + r1.subtract(r2));
            System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
            System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
            System.out.println(r2 + " is " + r2.doubleValue());
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        }

        try {
            r1 = new Rational(3, 2);
            r2 = new Rational(0, 4);

            System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
            System.out.println(r1 + " − " + r2 + " = " + r1.subtract(r2));
            System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
            System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
            System.out.println(r2 + " is " + r2.doubleValue());
            System.out.println();
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        }

        // sort the rational numbers
        Rational[] array = {new Rational(-2, 3), new Rational(3, -2),
        new Rational(-4, -2), new Rational(5, 1), new Rational(0, 1)};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
