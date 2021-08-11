package chap7;

public class SwapValuesInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        // the array is passed by reference
        printArray(array);
        swapArray(array);
        printArray(array);
    }

    private static void swapArray(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }

    public static void printArray(int[] array) {
        for (int e : array)
            System.out.print(e + " ");
        System.out.println();
    }
}
