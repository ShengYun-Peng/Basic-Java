package chap7;

public class PassArrayParameters {
    public static void printArray(int[] array) {
        for (int e : array)
            System.out.print(e + " ");
    }

    public static void main(String[] args) {
        int[] myArray = {2, 3, 1, 5, 3};
        printArray(myArray);
    }
}
