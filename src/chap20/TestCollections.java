package chap20;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("yellow", "red", "green", "blue");
        System.out.println(list instanceof List);

        // original list
        List<String> listCopy = new ArrayList<>(list);
        System.out.println(listCopy);

        // sort in natural order
        Collections.sort(listCopy);
        System.out.println(listCopy);

        // sort in reverse order
        Collections.sort(listCopy, Collections.reverseOrder());
        System.out.println(listCopy);

        // sort in string length
        Collections.sort(listCopy, Comparator.comparing(String::length));
        System.out.println(listCopy);

        // reverse order
        Collections.reverse(listCopy);
        System.out.println(listCopy);

        // shuffle
        Collections.shuffle(listCopy);
        System.out.println(listCopy);

        // shuffle with random
        Collections.shuffle(listCopy, new Random(20));
        System.out.println(listCopy);

        // find the min with my comparator
        System.out.println(Collections.min(listCopy, Comparator.comparing(String::length)));

        // list is still the same
        System.out.println(list);
    }
}
