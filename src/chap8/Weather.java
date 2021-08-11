package chap8;

import java.util.Arrays;
import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        // run it in the command line
        final int NUMBER_OF_HOURS = 24;

        Scanner input = new Scanner(System.in);

        double[][][] weather = new double[10][NUMBER_OF_HOURS][2];
        double[] avgTemp = new double[10];
        double[] avgHumidity = new double[10];
        for (int i = 0; i < weather.length; ++i) {
            for (int j = 0; j < weather[i].length; ++j) {
                int day = input.nextInt();
                int hour = input.nextInt();
                weather[i][j][0] = input.nextDouble();
                weather[i][j][1] = input.nextDouble();

                avgTemp[i] += weather[i][j][0];
                avgHumidity[i] += weather[i][j][1];
            }
            avgTemp[i] /= NUMBER_OF_HOURS;
            avgHumidity[i] /= NUMBER_OF_HOURS;
        }

        System.out.println(Arrays.toString(avgTemp));
        System.out.println(Arrays.toString(avgHumidity));
    }
}
