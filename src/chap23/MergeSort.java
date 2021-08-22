package chap23;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {2, 3, 2, 5, 6, 1, -2, 3, 14};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int[] firstHalf = new int[array.length / 2];
            System.arraycopy(array, 0, firstHalf, 0, firstHalf.length);
            mergeSort(firstHalf);

            int[] secondHalf = new int[array.length - array.length / 2];
            System.arraycopy(array, array.length / 2, secondHalf, 0, array.length - array.length / 2);
            mergeSort(secondHalf);

            merge(firstHalf, secondHalf, array);
        }
    }

    public static void merge(int[] half1, int[] half2, int[] array) {
        int crt1 = 0;
        int crt2 = 0;
        int crt3 = 0;

        while (crt3 < array.length) {
            if (crt1 < half1.length && crt2 < half2.length) {
                if (half1[crt1] <= half2[crt2]) {
                    array[crt3] = half1[crt1];
                    ++crt1;
                } else {
                    array[crt3] = half2[crt2];
                    ++crt2;
                }
            } else if (crt1 < half1.length) {
                array[crt3] = half1[crt1];
                ++crt1;
            } else {
                array[crt3] = half2[crt2];
                ++crt2;
            }
            ++crt3;
        }
    }
}
