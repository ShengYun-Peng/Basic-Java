package chap23;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {2, 9, 5, 4, 8, 1, 6};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        // insert a new element and compare with all the previous elements in the array
        // time complexity: O(n^2)
        int j;
        for (int i = 1; i < array.length; ++i) {
            int currentValue = array[i];
            for (j = i - 1; j >= 0 && array[j] > currentValue; --j) {
                array[j + 1] = array[j];
            }
            array[j + 1] = currentValue;
        }
    }
}
