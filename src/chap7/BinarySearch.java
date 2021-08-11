package chap7;

public class BinarySearch {
    public static int binarySearch(int[] array, int key) {
        int lo = 0;
        int hi = array.length - 1;

        while (lo <= hi) {
            int mi = (lo + hi) / 2;
            if (key < array[mi]) {
                hi = mi - 1;
            } else if (key > array[mi]) {
                lo = mi + 1;
            } else
                return mi;
        }
        return -1 - lo;
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(BinarySearch.binarySearch(array, 2)); // Returns 0
        System.out.println(BinarySearch.binarySearch(array, 11)); // Returns 4
        System.out.println(BinarySearch.binarySearch(array, 79)); // Returns 4
        // when the value is not found, we return the place where it can be inserted
        System.out.println(BinarySearch.binarySearch(array, 12)); // Returns –6
        System.out.println(BinarySearch.binarySearch(array, 1)); // Returns –1
        System.out.println(BinarySearch.binarySearch(array, 3)); // Returns -2
    }
}
