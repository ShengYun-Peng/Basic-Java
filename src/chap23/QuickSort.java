package chap23;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {2, 3, 2, 5, 6, 1, -2, 3, 14};
        // int[] array = {5, 4, 3, 2, 1, 1};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array) {
        // time complexity: O(nlogn)
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(array, first, last);
            quickSort(array, first, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, last);
        }
    }

    public static int partition(int[] array, int first, int last) {
        int pivot = array[first];
        int oriFirst = first;
        ++first;

        while (first < last) {
            while (first <= last && array[first] <= pivot)
                ++first;
            while (first <= last && array[last] >= pivot)
                --last;
            if (last > first) {
                int tmp = array[first];
                array[first] = array[last];
                array[last] = tmp;
            }
        }

        if (pivot > array[last]) {
            array[oriFirst] = array[last];
            array[last] = pivot;
        }

        return last;
    }
}
