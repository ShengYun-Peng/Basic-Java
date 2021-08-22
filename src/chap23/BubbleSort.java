package chap23;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        // add another flag to check whether a new compare is needed
        // if nothing is swapped in the current pass, then the array is in order
        // time complexity: O(n^2)
        boolean needNextPass = true;
        for (int i = 1; i < array.length && needNextPass; ++i) {
            needNextPass = false;
            for (int j = 0; j < array.length - i; ++j) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j]; array[j] = array[j + 1]; array[j + 1] = tmp;
                    needNextPass = true;
                }
            }
        }
    }
}
