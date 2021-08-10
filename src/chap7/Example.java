package chap7;

public class Example {
    public static void main(String[] args) {
        double[] array = new double[10];
        array[0] = 1;
        System.out.println(array[0]);

        char[] city = {'a', 't', 'l'};
        System.out.println(city);

        // random shuffling
        int[] vec1 = new int[10];
        for (int i = 0; i < vec1.length; ++i) {
            vec1[i] = i;
        }
        for (int i = 0; i < vec1.length; ++i) {
            int j = (int) (Math.random() * vec1.length);
            int temp = vec1[i];
            vec1[i] = vec1[j];
            vec1[j] = temp;
        }

        for (int j : vec1) {
            System.out.printf("%4d", j);
        }
        System.out.println();

        // shift left
        int temp = vec1[0];
        for (int i = 1; i < vec1.length; ++i)
            vec1[i - 1] = vec1[i];
        vec1[vec1.length - 1] = temp;

        for (int j : vec1)
            System.out.printf("%4d", j);
        System.out.println();

        // check foreach loop
        for (int i : vec1)
            i = i + 1;
        for (int i : vec1)
            System.out.printf("%4d", i);
    }
}
