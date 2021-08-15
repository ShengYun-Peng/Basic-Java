package chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestListMethod {
    public static void main(String[] args) {
        // need to use Integer rather than int to create the array
        Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
    }
}
