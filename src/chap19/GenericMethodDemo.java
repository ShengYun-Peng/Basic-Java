package chap19;

public class GenericMethodDemo {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"London", "Paris", "New York", "Austin"};

        GenericMethodDemo.print(integers);
        GenericMethodDemo.print(strings);
    }

    // generic method
    public static <E> void print(E[] array) {
        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
