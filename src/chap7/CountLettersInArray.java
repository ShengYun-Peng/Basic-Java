package chap7;

public class CountLettersInArray {
    public static void main(String[] args) {
        // generate an array of length 100 with all lowercase letters
        int count = 100;
        char[] array = generateRandomLetters(count);

        int[] countArray = countLetters(array);

        printArray(countArray);
    }

    private static void printArray(int[] countArray) {
        for (char i = 'a'; i <= 'z'; ++i) {
            System.out.printf("%4c", i);
        }
        System.out.println();
        for (int j : countArray) {
            System.out.printf("%4d", j);
        }
    }

    private static int[] countLetters(char[] array) {
        int[] countArray = new int[26];
        for (char e: array) {
            ++countArray[e - 'a'];
        }

        return countArray;
    }

    private static char[] generateRandomLetters(int count) {
        char[] array = new char[count];
        for (int i = 0; i < count; ++i) {
            array[i] = getRandomLowercaseLetter();
        }

        return array;
    }

    public static char getRandomLowercaseLetter() {
        return (char) ('a' + Math.random() * ('z' - 'a' + 1));
    }
}
