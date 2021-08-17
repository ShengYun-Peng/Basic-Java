package chap18;

import java.util.Arrays;

public class RecursiveSelectionSort {
    public static void sort(double[] list) {
        sort(list, 0, list.length - 1);
    }

    public static void sort(double[] list, int low, int high) {
        if (low < high) {
            double min = list[low];
            int idx = low;
            for (int i = low + 1; i <= high; ++i) {
                if (min > list[i])
                    idx = i;
            }
            swap(list, low, idx);

            sort(list, low + 1, high);
        }
    }

    public static void swap(double[] list, int i, int j) {
        double tmp = list[i];
        list[i] = list[j];
        list[j] = tmp;
    }

    public static void main(String[] args) {
        double[] array = {2.2, -1.2, 4, 12, 5.6};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
