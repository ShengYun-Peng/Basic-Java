package chap18;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 5, 8, 13, 17, 23, 56};
        int key = 4;
        int idx = binarySearch(array, key);

        System.out.println("The " + key + " you are searching is at: " + idx);
    }

    public static int binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length - 1);
    }

    public static int binarySearch(int[] array, int key, int low, int high) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (key < array[mid])
                high = mid - 1;
            else if (key > array[mid])
                low = mid + 1;
            else
                return mid;

            return binarySearch(array, key, low, high);
        } else {
            return (-1) * (low + 1);
        }
    }
}
