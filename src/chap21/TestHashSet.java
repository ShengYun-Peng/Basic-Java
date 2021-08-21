package chap21;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        // there is no order in the set
        System.out.println(set);
        set.forEach(e -> System.out.print(e.toUpperCase() + " "));
        System.out.println();

        System.out.println(set.size());

        set.remove("Paris");
        System.out.println(set);
    }
}
