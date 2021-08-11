package chap8;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[][] array = new int[5][];
        array[0] = new int[5];
        array[1] = new int[4];
        array[2] = new int[3];
        array[3] = new int[2];
        array[4] = new int[1];
        for (int[] e : array)
            System.out.println(Arrays.toString(e));
    }
}
