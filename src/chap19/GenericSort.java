package chap19;

import java.util.Arrays;

public class GenericSort {
    public static void main(String[] args) {
        Integer[] intArray = {2, 4, 3};
        Double[] doubleArray = {3.4, 1.3, -22.1};
        Character[] charArray = {'a', 'J', 'r'};
        String[] stringArray = {"Tom", "Susan", "Kim"};

        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(Arrays.toString(charArray));
        System.out.println(Arrays.toString(stringArray));
    }

    public static <E extends Comparable<E>> void sort(E[] array) {
        int minIdx;
        E minValue;

        for (int i = 0; i < array.length - 1; ++i) {
            minIdx = i;
            minValue = array[minIdx];
            for (int j = i + 1; j < array.length; ++j) {
                if (array[j].compareTo(minValue) < 0) {
                    minIdx = j;
                    minValue = array[minIdx];
                }
            }
            array[minIdx] = array[i];
            array[i] = minValue;
        }
    }
}
