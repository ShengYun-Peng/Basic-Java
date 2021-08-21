package chap21;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("Tree set: " + set);

        System.out.println("first: " + treeSet.first());
        System.out.println("last: " + treeSet.last());
        // print everything smaller than the element "New York"
        System.out.println("first set: " + treeSet.headSet("New York"));
        System.out.println("first set: " + treeSet.headSet("New York"));
        System.out.println("tail set: " + treeSet.tailSet("New York"));

        // less than
        System.out.println("previous: " + treeSet.lower("P"));
        System.out.println("next: " + treeSet.higher("P"));
        // less than or equal to
        System.out.println("floor: " + treeSet.floor("P"));
        System.out.println("ceil: " + treeSet.ceiling("P"));

        // remove first and display
        System.out.println("first: " + treeSet.pollFirst());
        System.out.println("last: " + treeSet.pollLast());
        System.out.println("new set: " + treeSet);
    }
}
