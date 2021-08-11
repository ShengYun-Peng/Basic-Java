package chap7;

import java.util.Arrays;

public class TestArrayClass {
    public static void main(String[] args) {
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        Arrays.parallelSort(numbers);  // uses multi processor
        for (double i : numbers)
            System.out.print(i + " ");
        System.out.println();

        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        Arrays.parallelSort(chars, 1, 4);  // toIndex not included
        for (char i : chars)
            System.out.print(i + " ");
        System.out.println();

        // test fill method
        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 7, 7, 10};
        Arrays.fill(list1, 5);
        Arrays.fill(list2, 1, 3, 8);
        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));
    }
}
