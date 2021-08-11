package chap7;

public class SelectionSort {
    public static void swap(double[] array, int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void selectionSort(double[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            for (int j = i + 1; j < array.length; ++j) {
                if (array[i] > array[j])
                    swap(array, i, j);
            }
        }
    }

    public static void printArray(double[] array) {
        for (double e : array)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        double[] list1 = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list1);
        printArray(list1);

        double[] list2 = {1};
        selectionSort(list2);
        printArray(list2);

        double[] list3 = {1, 1, 1};
        selectionSort(list3);
        printArray(list3);

    }
}
