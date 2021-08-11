package chap8;

import java.util.Arrays;
import java.util.Scanner;

public class FindNearestPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] array = new double[8][2];
        for (int i = 0 ; i < array.length; ++i)
            for (int j = 0; j < array[i].length; ++j)
                array[i][j] = input.nextDouble();

        double shortestDistance = Double.POSITIVE_INFINITY;
        int coor1 = 0, coor2 = 0;
        for (int i = 0; i < array.length - 1; ++i) {
            for (int j = i + 1; j < array.length; ++j) {
                double dist = computeDistance(array[i], array[j]);
                if (dist < shortestDistance) {
                    shortestDistance = dist;
                    coor1 = i;
                    coor2 = j;
                }
            }
        }

        System.out.println("The two closest points are " + Arrays.toString(array[coor1])
                + " and " + Arrays.toString(array[coor2]) + " distance: " + shortestDistance);
    }

    public static double computeDistance(double[] coor1, double[] coor2) {
        double dist = 0.0;

        for (int i = 0; i < coor1.length; ++i) {
            dist += Math.pow(coor1[i] - coor2[i], 2);
        }

        return Math.sqrt(dist);
    }
}
