package chap23;

import java.util.Arrays;

public class heapSort {
    public static void heapSort(int[] array) {
        Heap<Integer> heap = new Heap<>();
        for (int i : array)
            heap.add(i);

        for (int i = array.length - 1; i >= 0; --i)
            array[i] = heap.remove();
    }

    public static void main(String[] args) {
        int[] list = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
        heapSort(list);
        System.out.println(Arrays.toString(list));
    }
}
