package chap21;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSetWithComparator {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>(Comparator.comparing(String::length));
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        // same length with paris, so it will not be added
        set.add("12345");
        set.add("New York");

        System.out.println(set);
    }
}
